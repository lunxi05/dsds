
<%@page import="java.util.Scanner"%>
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
<title>Document</title>


</head>

<body>
	<div id="body">
		<div class="content-box">


			<main>


			<section>
				<h1>공지사항1</h1>

				<section>
					<h3>공지사항 내용</h3>
					<form action="reg" method="post">
						<select name="type">
							<option value="공지사항">공지사항</option>
							<option value="이벤트" >이벤트</option>
						</select>
						<table>
							<tbody>
								<tr>
									<th>제목</th>
									<td><input name="title" type="text"></td>
								</tr>
								<tr>
									<th>내용</th>
									<td><textarea name="content"></textarea></td>
								</tr>
							</tbody>
						</table>
						<div>
							<input type="submit" value="저장"> <a href="list">취소</a>
						</div>
					</form>
				</section>


			</section>
			</main>

		</div>
	</div>


</body>

</html>