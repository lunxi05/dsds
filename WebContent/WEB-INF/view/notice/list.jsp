<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Black Swan Funding</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/notice.css">
<script src="../js/notice/list.js"></script>
</head>


<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../inc/header.jsp" />


	<main>
	<jsp:include page="../inc/breadcrumb.jsp" />
	
	<section id="notice-title">
		<h1>공지사항</h1>
	</section>
	
	<section id="notice-tab">
		<h1 class="hidden">고객센터 탭</h1>
		<div class="center">
			<ul>
				<li><a href="/blackswan2/notice/list">공지사항</a></li>
				<li><a href="/blackswan2/qna/list">QnA</a></li>
			</ul>
		</div>
	</section>	

	<section id="main" class="notice">
		<h1 class="hidden">공지사항 목록</h1>
		<div class="center">
			<section class="notice-table">
				<h1 class="hidden">공지사항 테이블</h1>
				<label for="n-table">전체<span>${ncount}</span></label>
				<table id="list-table">
					<thead>
						<tr>
							<th class="id">번호</th>
							<th class="division">구분</th>
							<th class="title">제목</th>
							<th class="date">작성일</th>
							<th class="hit">조회수</th>
						</tr>
					</thead>

					<tbody class="tbody">
						<c:forEach var="n" items="${nlist}" varStatus="s">
							<tr>
								<td class="id">${n.id}</td>

								<td class="division">
								<c:if test="${n.division == 0}">공지사항</c:if>
								<c:if test="${n.division == 1}">이벤트</c:if></td>
								<td class="title"><a href="detail?id=${n.id}">${n.title}</a></td>
								<td class="date">${n.regdate}</td>
								<td class="hit">${n.hit}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="notice-reg"><a href="/blackswan2/notice/reg">등록</a></div>
			</section>

			<c:set var="p" value="${(empty param.page) ? 1 : param.page}" />
			<c:set var="start" value="${p - (p-1)%5}" />

			<section class="paging">
				<h1 class="hidden">페이저</h1>
				<div class="first-page">
					<a href="list?page=1">처음</a>
				</div>
				<div class="prev-page">
					<a href="list?page=${(p < 6)? p : p -5}&state=${param.state}&sdate=${param.sdate}&edate=${param.edate}&title=${param.title}">이전</a>
				</div>
				<ul>
					<c:forEach var="n" begin="${start}" end="${start+4}" varStatus="s">
						<li><a href="list?page=${n}&state=${param.state}&sdate=${param.sdate}&edate=${param.edate}&title=${param.title}">${n}</a></li>
					</c:forEach>
				</ul>
				<div class="next-page">
					<a href="list?page=${start+5}&state=${param.state}&sdate=${param.sdate}&edate=${param.edate}&title=${param.title}">다음</a>
				</div>
				<div class="end-page">
					<a href="">끝</a>
				</div>
			</section>
		</div>
	</section>
	</main>

	<jsp:include page="../inc/footer.jsp" />
</body>
</html>