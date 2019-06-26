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
	
	<section id="notice-title">
		<h1>공지사항</h1>
	</section>
	
	<section id="notice-tab">
		<h1 class="hidden">고객센터 탭</h1>
		<div class="center">
			<ul>
				<li><a href="/blackswan2/notice/list">공지사항</a></li>
				<li><a href="/blackswan2/qna/list">QnA</a></li>
			</ul>
		</div>
	</section>	
	
			<style>
				
				#notice-reg input, #notice-reg textarea {
					border: 1px solid red;
				}
				
				
				#notice-reg {
					width: 100%;
				}
				
				#notice-reg table, #notice-reg table tr {
					width: 100%;
				}
				
				#notice-reg table tr td {
					border: 1px solid #d2d2d2;
				}
				
				#notice-reg table tr td:first-child {
					background: #e4e4e4;
					width: 20%;
				}
				
			
			</style>
	
		
			<section id="notice-reg">
				<h3 class="hidden">공지사항 내용</h3>
				<div class="center">
					<form action="reg" method="post">
						<table>
							<tr>
								<td>구분</td>
								<td>
									<select name="division">
										<option value="0">공지사항</option>
										<option value="1">이벤트</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>제목</td>
								<td><input name="title" type="text"></td>
							</tr>
							<tr>
								<td>내용</td>
								<td><textarea name="content"></textarea></td>
							</tr>
						</table>
						<input type="submit" value="저장"> <a href="list">취소</a>
					</form>
				</div>
			</section>

	</main>

	<jsp:include page=".././inc/footer.jsp" />
</body>
</html>
