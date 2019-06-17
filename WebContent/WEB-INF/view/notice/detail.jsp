<%@page import="com.blackswan.web.dao.oracle.OracleNoticeDao"%>
<%@page import="com.blackswan.web.dao.NoticeDao"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="com.blackswan.web.entity.Notice"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	NoticeDao noticeDao = new OracleNoticeDao();

	int id = Integer.parseInt(request.getParameter("id"));
	Notice n = noticeDao.get(id);
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
</head>
<body>
	<div id="body">
		<div class="content-box">

			<main>
			<section>
				<h1>공지사항</h1>

				<section>
					<h3>공지사항 내용</h3>
					<table>
						<tbody>
							<tr>
								<th>타입</th>
								<td>${notice.division}</td>
							</tr>
							<tr>
								<th>제목</th>
								<td>${notice.title}</td>
							</tr>
							<tr>
								<th>작성일</th>
								<td>${notice.regDate}</td>
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

		</div>
	</div>

</body>
</html>
