<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href=".././css/style.css">
<link rel="stylesheet" type="text/css" href=".././css/index.css">

</head>
<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../inc/header.jsp" />

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
				<li></li>
			</ul>
		</div>
	</section>

	<section id="main">
		<h1 class="hidden">메인컨텐츠</h1>
		<div class="center">

			<div>
				${funding.id}<br> ${funding.adminId}<br>
				${funding.memberId}<br> ${funding.categoryId}<br>
				${funding.regdate}<br> ${funding.title}<br>
				${funding.tAmount}<br> ${funding.introVideo}<br>
				${funding.introImg}<br> ${funding.sdate}<br>
				${funding.edate}<br> ${funding.hit}<br> ${funding.state}<br>
			</div>
			
			
			
			
			
			
		</div>
	</section>
	</main>
</body>
</html>