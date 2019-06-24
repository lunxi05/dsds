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
	<section id="admin-title">관리자</section>
	<section id="admin-tab">
		<h1 class="hidden">관리자 탭</h1>
		<div class="center">
			<ul>
				<li>회원관리</li>
				<li>펀딩관리</li>
				<li>이벤트관리</li>
				<li>카테고리관리</li>
			</ul>
		</div>
	</section>
	<section id="main" class="admin">
		<h1 class="hidden">회원관리페이지</h1>
		<div class="center">
			<section id="member-search">
				<h1 class="hidden">회원 검색</h1>
				<form id="member-search-form" method="post">
					<input type="radio" name="field" value="email" id="msemail">
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
					<input type="submit" value="검색">
				</form>
			</section>
			<section id="member-list">
				<h1 class="hidden">회원 목록</h1>
				<div class="search-count">검색결과 : 총 ${count}건</div>
				<table class="list-table">
					<thead>
						<tr>
							<td>회원번호</td>
							<td>아이디(메일)</td>
							<td>이름(기업명)</td>
							<td>가입일</td>
							<td>정보조회</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="m" items="${member}">
							<tr>
								<td class="id">${m.id}</td>
								<td class="email">${m.email}</td>
								<td class="name">${m.name}</td>
								<td class="regdate">${m.regdate}</td>
								<td><a href="detail?id=${m.id}">보기</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>

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

	<jsp:include page="../../inc/footer.jsp" />

</body>
</html>

