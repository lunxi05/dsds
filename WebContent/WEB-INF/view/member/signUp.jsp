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
<link rel="stylesheet" type="text/css" href="../css/style.css">
<!-- <script src="../js/member/signUp.js"></script> -->
<style type="text/css">

input {
border: 1px solid;
}

</style>

</head>
<body>

	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../inc/header.jsp" />
	
	<main>
	<section>
		<h1>회원가입</h1>

		<section>
			<form action="signUp" method="post">
				<table >
					<tbody>
						<tr>
							<td><input name="email" type="email" placeholder="email을 입력하세요"></td>
						</tr>
						<tr>
							<td><input name="name" type="text" placeholder="이름을 입력하세요"></input></td>
						</tr>
						<tr>
							<td><input name="pw" type="password" placeholder="새 비밀번호(영문,숫자,특수문자를 포함한 10~16자리)"></input></td>
						</tr>
						<tr>
							<td><input name="pw" type="password" placeholder="비밀번호 확인"></input></td>
						</tr>
						<tr>
							<td><input name="phone" type="number" placeholder="휴대폰번호(‘-’ 없이 입력)"></input></td>
						</tr>
					</tbody>
				</table>
				
				<div>
					<input name="event_agree" type="checkbox" value="Y" checked>
					<span>펀딩 소식과 이벤트 안내를 받습니다(선택)</span> <br>
					<span>본인은 만 14세 이상이며 회원기본약관, 이용약관, 개인정보처리방침 내용에 동의합니다.</span>
				</div>
				
				<div>
					<input class="signUp" type="submit" value="가입하기"> <br> <a href="/blackswan2/index">홈으로 돌아가기</a>
				</div>
			</form>
		</section>


	</section>
	</main>
	
	<jsp:include page="../inc/footer.jsp" />
	

</body>
</html>