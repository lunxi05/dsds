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
<link rel="stylesheet" type="text/css" href=".././css/style.css">
<link rel="stylesheet" type="text/css" href=".././css/notice.css">
</head>
<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page=".././inc/header.jsp" />

	<main>
			<section>
				<h1>공지사항</h1>

				<section>
					<h3>공지사항 내용</h3>
					<table>
						<tbody>
							<tr>
								<th>타입</th>
								<td>
									<c:if test="${notice.division == 0}">공지사항</c:if>
		              			    <c:if test="${notice.division == 1}">이벤트</c:if>
	              			    </td>
							</tr>
							<tr>
								<th>제목</th>
								<td>${notice.title}</td>
							</tr>
							<tr>
								<th>작성일</th>
								<td>${notice.regdate}</td>
							</tr>
							<tr>
								<th>내용</th>
								<td>${notice.content}</td>
							</tr>
						</tbody>
					</table>
					<div>
						<a href="edit?id=${notice.id}">수정</a>
						<a href="del?id=${notice.id}">삭제</a>
						<a href="list?id=${notice.id}">목록</a>
							
					</div>
				</section>
			</section>
			<section>
				<h1></h1>
				<ul>
					<li><span>이전글</span><a href="detail?id=${prev.id}">${prev.title}</a></li>
					<li><span>다음글</span><a href="detail?id=${next.id}">${next.title}</a></li>
				</ul>
			</section>
	</main>

	<jsp:include page=".././inc/footer.jsp" />
</body>
</html>
