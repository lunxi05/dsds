<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Black Swan Funding</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="./inc/header.jsp"/>

	<main>	
		<section id="main">
			<h1 class="hidden">메인컨텐츠</h1>
			<div class="center">
			
			<style>
				.center {
					text-align: center;
					line-height: 180%;
				}
				img {
					width: 100px;
					height: 100px;
					display: block; 
					margin: 50px auto 20px;
				}
			</style>
				
				<img src="./images/error.png">
				에러가 발생했습니다.<br/>
				이전페이지로 돌아가 다시 시도해 주세요.
			
			</div>
		</section>
	</main>

	<jsp:include page="inc/footer.jsp"/>	

</body>
</html>