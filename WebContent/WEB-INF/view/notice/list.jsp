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
<!-- <script src="../js/notice/list.js"></script> -->
</head>


<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../inc/header.jsp" />


	<main>
	<section id="breadcrumb">
		<h1 class="hidden">경로</h1>
		<div class="center">
			<ul>
				<li><a href="/blackswan2/index">홈</a></li>
				<li><script>
					var url = window.location.pathname;
					var bread = url.split("/")[2];
					switch (bread) {
					case "funding":
						document.write("펀딩");
						break;
					case "reg":
						document.write("등록신청");
						break;
					case "notice":
						document.write("고객센터");
						break;
					}
				</script></li>
				<li>공지사항</li>
			</ul>
		</div>
	</section>

	<section id="main">
		<h1>공지사항</h1>
		<div class="center">
			<section class="notice-table">
				<h1 class="hidden">공지사항 테이블</h1>
				<label for="n-table">전체<span>410</span></label>
				<table id="list-table">
					<thead>
						<tr>
							<td class="id">번호</td>
							<td class="division">구분</td>
							<td class="title">제목</td>
							<td class="date">작성일</td>
							<td class="hit">조회수</td>
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
								<td class="date">${n.date}</td>
								<td class="date">${n.regdate}</td>
								<td class="hit">${n.hit}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>

			<c:set var="page" value="${(empty param.p) ? 1 : param.p}"></c:set>
			<c:set var="start" value="${page-(page-1)%5}"></c:set>
			<c:set var="last" value="" />

			<c:set var="page" value="${(empty param.p) ? 1 : param.p}"></c:set>
			<c:set var="start" value="${page-(page-1)%5}"></c:set>

			<section class="paging">
				<h1 class="hidden">페이저</h1>
				<div class="first-page">
					<!-- <a href="list?p=1">처음</a> -->
				</div>
				<div class="prev-page">
					<%-- <a href="list?p=${(start == 1) ? 1 : start-1}">이전</a> --%>
				</div>
				<ul>
					<c:forEach var="n" begin="${start}" end="${start+4}" varStatus="s">
						<li value="${n}">${n}</li>
					</c:forEach>
				</ul>
				<div class="next-page">
					<%-- <a href="${start+5}">다음</a> --%>
				</div>
				<div class="end-page">
					<!-- <a href="">끝</a> -->
				</div>
			</section>
		</div>
	</section>
	</main>

	<jsp:include page="../inc/footer.jsp" />
</body>
</html>