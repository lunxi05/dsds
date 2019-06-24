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
<link rel="stylesheet" type="text/css" href="../../css/style.css">
<link rel="stylesheet" type="text/css" href="../../css/admin.css">
<script src="/js/admin/member/list.js"></script>
</head>


<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../../inc/header.jsp" />

	<main>
	<section id="admin-title"><h1>관리자</h1></section>
	<section id="admin-tab">
		<h1 class="hidden">관리자 탭</h1>
		<div class="center">
			<ul>
				<li><a href="/blackswan2/admin/member/list">회원관리</a></li>
				<li><a href="/blackswan2/admin/funding/list">펀딩관리</a></li>
				<li><a href="/blackswan2/admin/event/list">이벤트관리</a></li>
				<li><a href="/blackswan2/admin/category">카테고리관리</a></li>
			</ul>
		</div>
	</section>
	<section id="main" class="admin">
		<h1 class="hidden">펀딩관리페이지</h1>
		<div class="center">
			<section id="funding-search">
				<h1 class="hidden">펀딩 검색</h1>
				<form id="funding-search-form" method="post">
<!-- 					<input type="radio" name="field" value="email" id="msemail">
					<label for="msemail">
						<label for="member-mail">이메일</label><input type="text" name="query" id="member-mail">
					</label>
					<input type="radio" name="field" value="name" id="msname">
					<label for="msname">
						<label for="member-name">이름</label><input type="text" name="query" id="member-name">
					</label>
					<input type="radio" name="field" value="id" id="msid">
					<label for="msid">
						<label for="member-id">회원번호</label><input type="text" name="query" id="member-id">
					</label>
					<input type="radio" name="field" value="regdate" id="msregdate">
					<label for="msregdate">
						<label for="member-reg">가입일</label><input type="date" name="query" id="member-reg">
					</label>
					<input type="submit" value="검색"> -->
				</form>
			</section>
			<section id="funding-list">
				<h1 class="hidden">펀딩 목록</h1>
				<div class="search-count">검색결과 : 총 ${afcount}건</div>
				<table class="list-table">
 					<thead>
						<tr>
							<th>펀딩번호</th>
							<th>업체명</th>
							<th>펀딩이름</th>
							<th>신청일</th>
							<th>펀딩기간</th>
							<th>참여율</th>
							<th>목표금액</th>
							<th>상태</th>
							<th>관리</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="l" items="${aflist}">
							<tr>
								<td>${l.id}</td>
								<td>${l.companyName}</td>
								<td>${l.cateName}</td>
								<td>${l.regdate}</td>
								<td>${l.sdate} ~ ${l.edate}</td>
								<td>${l.partRate}%</td>
								<td>${l.tAmount}</td>
								<td>${l.state}</td>
								<td><a href="detail?id=${l.id}">관리</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>

			<c:set var="p" value="${(empty param.page) ? 1 : param.page}" />
			<c:set var="start" value="${p - (p-1)%5}" />

			<section class="paging">
				<h1 class="hidden">페이저</h1>
				<div class="first-page">
					<a href="list?p=1">처음</a>
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

	<jsp:include page="../../inc/footer.jsp" />

</body>
</html>

