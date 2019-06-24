<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<main>
	<section>
		<h1>회원가입</h1>

		<section>
			<form action="signUp" method="post">
				<table>
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
					<input type="submit" value="동의하고 가입하기"> <br> <a href="/blackswan2/index">홈으로 돌아가기</a>
				</div>
			</form>
		</section>


	</section>
	</main>
	

</body>
</html>