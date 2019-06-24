
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
				<h1>펀딩등록</h1>

				<section>
					<h2>펀딩등록 상세</h2>
					<form action="reg" method="post">
						
						<table>
							<tbody>
								<tr>
									<th>카테고리</th>
									<td>
										<select name="category" >
											<option value="4">사료</option>
											<option value="5">간식</option>
											<option value="6">배변용품</option>
											<option value="7">건강관리</option>
											<option value="8">미용용품</option>
											<option value="9">장난감</option>
											<option value="10">리빙</option>
											<option value="11">패션</option>
											<option value="12">야외용품</option>
											<option value="13">기타</option>
										</select>
									</td>
								</tr>
								<tr>
									<th>프로젝트 제목</th>
									<td><textarea name="content"></textarea></td>
								</tr>
								<tr>
									<th>프로젝트 이미지</th>
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