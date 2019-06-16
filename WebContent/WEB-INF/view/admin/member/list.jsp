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
<link rel="stylesheet" type="text/css" href="../../css/index.css">
</head>

 
<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../../inc/header.jsp"/>

	<main>
		<section id="admin-title">
			<h1>관리자</h1>
			<section id="admin-tap">
				<style>
					#admin-title {
						background: #bdbdbd;
					}
					#admin-tap ul {
						display: flex;
					}
					#member-search {
						border-bottom: 1px solid; margni-bottom: 20px; 
					}
				</style>
			
				<h1 class="hidden">관리자 탭</h1>
				<ul>
					<li>회원관리</li>
					<li>펀딩관리</li>
					<li>이벤트관리</li>
					<li>카테고리관리</li>
				</ul>
			</section>
		</section>
		<section id="main">
			<h1 class="hidden">회원관리페이지</h1>
			<div class="center">
				<section id="member-search">
					<h1 class="hidden">회원 검색</h1>
					<form id="member-search-form" action="post">
						<label for="member-id">아이디(메일)</label><input type="text" id="member-id">
						<label for="member-name">이름(기업명)</label><input type="text" id="member-name">
						<label for="member-reg">가입일</label><input type="date" id="member-reg">
						<label for="member-black">구분</label>
						<div id="member-black">
							<label for="m-normal">일반</label><input type="checkbox" checked id="m-normal">
							<label for="m-black">블랙</label><input type="checkbox" checked id="m-black">
						</div>
						<input type="submit" value="검색">
					</form>
				</section>
				<section id="member-list">
					<h1 class="hidden">회원 목록</h1>
					<div class="search-count">
						검색결과 : 총 ${count}건
					</div>
					<table>
						<thead>
							<tr>
								<td>번호</td>
								<td>아이디(메일)</td>
								<td>이름(기업명)</td>
								<td>가입일</td>
								<td>상태</td>
								<td>정보조회</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="m" items="${member}">
							<tr>
								<td>${m.num}</td>
								<td>${m.email}</td>
								<td>${m.name}</td>
								<td>${m.regdate}</td>
								<td>${m.state}</td>
								<td><a href="detail?=${m.id}">보기</a></td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				</section>
			</div>
		</section>
	</main>

	<jsp:include page="../../inc/footer.jsp"/>

</body>
</html>

