<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Black Swan Funding</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>

	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../inc/header.jsp" />
	
	<main>
	<section>
		<h1>로그인</h1>

		<section>
			<form action="login" method="post">
				<table >
					<tbody>
						<tr>
							<td><input name="email" type="text" placeholder="email을 입력하세요"></td>
						</tr>
						<tr>
							<td><input name="pw" type="password" placeholder="비밀번호를 입력하세요"></input></td>
						</tr>
					</tbody>
				</table>
				
				<div>
					<input class="login" type="submit" value="로그인"> <br> <a href="/blackswan2/index">홈으로 돌아가기</a>
				</div>
			</form>
		</section>


	</section>
	</main>
	
	<jsp:include page="../inc/footer.jsp" />

</body>
</html>