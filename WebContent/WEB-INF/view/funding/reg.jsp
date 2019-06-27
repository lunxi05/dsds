
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
					<form action="reg" method="post" enctype="multipart/form-data">
						
						<table>
							<tbody>
	
								<tr>
									<th>카테고리</th>
									<td>
										<select name="categoryId" >
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
									<td><textarea name="title"></textarea></td>
								</tr>
								<tr>
									<th>목표 금액</th>
									<td><input type="text" name="tAmount"></td>
								</tr>
								<tr>
									<th>프로젝트 이미지</th>
									<td><input type="file" name="introImg"></td>
								</tr>
								<tr>
									<th>프로젝트 희망시작일</th>
									<td><input type="date" name="sdate"></td>
								</tr>
								<tr>
									<th>프로젝트 희망종료일</th>
									<td><input type="date" name="edate"></td>
								</tr>
								<tr>
									<th>프로젝트 소개</th>
									<td><textarea name="content"></textarea></td>
								</tr>
								<!-- <tr>
									<th>펀딩 id</th>
									<td>내용<input type="text" name="fid"></td>
								</tr> -->
								<tr>
									<th>리워드 내용</th>
									<td>금액<input type="text" name="rPrice"></td>
									<td>내용<input type="text" name="rContent"></td>
								</tr>
								<tr>
								  <td><input type="button" name="p-add" value="추가"></td>
								  <td><input type="button" name="p-del" value="삭제"></td>
								</tr> 
								<!-- <tr>
									<th>발송시작 시기</th>
									<td><input type="date" name="send-date"></td>
									<td><input type="date" name="send-date"></td>
								</tr> -->
						
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