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
</head>
<body>
	<div id="body">
		<main>
			<section>
				<h1>펀딩결제</h1>
				<form action="buying" method="post">
					<div>
						<label>결제 금액</label><br>
						<input name="payPR" type="text" placeholder="email을 입력하세요"><br>
					</div>
				</form>
			</section>
		</main>	
	</div>
</body>
</html>