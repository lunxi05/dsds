
<%@page import="java.util.Scanner"%>
<%@page import="com.blackswan.web.entity.Notice"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Document</title>
</head>



<body>

	<div id="body">
		<div class="content-box1">
			

		<main>
			<section>
				<h1>공지사항</h1>

				<section id="notice">
					<h3>공지사항 목록</h3>
					<table>
						<thead>
							<tr>
								<td class="num">번호</td>
								<td class="type">구분</td>
								<td class="title">제목</td>
								<td class="writerId">작성자</td>
								<td class="date">작성일</td>
								<td class="hit">조회수</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="n" items="${list}">
								<tr>
									<td class="num">${n.id}</td>
									<td class="type">${n.type}</td>
									<td class="title"><a href="detail?id=${n.id}">${n.title}</a></td>
									<td class="writerId">${n.writer_Id}</td>
									<td class="regDate">${n.regDate}</td>
									<td class="hit">${n.hit}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div>
						<a href="reg">글쓰기</a>
					</div>
				</section>
				
				<section id="pager">
					<div>
						<div class="icon-next">이전</div>
					
						<div class="icon-next-pager">다음</div>
					</div>
				</section>
			</section>
		</main>

		</div>
	</div>


</body>

</html>