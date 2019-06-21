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
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">
<script src="./js/index.js"></script>
</head>

 
<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="./inc/header.jsp"/>

	<main>
		<jsp:include page="./inc/nav.jsp"/>	
	
		
		<section id="banner">
			<h1 class="hidden">배너</h1>
			<div class="center">
				<ul>
					<li class="front"><a href=""><img src="images/banner.jpg"></a></li>
					<li class="back"><a href=""><img src="https://cdn.pixabay.com/photo/2017/03/25/17/55/color-2174045__340.png"></a></li>
					<li class="back"><a href=""><img src="https://cdn.pixabay.com/photo/2015/09/26/11/21/banner-958962_960_720.jpg"></a></li>
				</ul>
				<div class="prev-banner"></div>
				<div class="next-banner"></div>
				<div class="banner-page">1&nbsp;/&nbsp;3</div>
			</div>
		</section>
	
		<section id="main">
			<h1 class="hidden">메인컨텐츠</h1>
			<div class="center">
				<section class="tap-select">
					<h1 class="hidden">메인펀딩 탭</h1>
					<ul>
						<li>인기펀딩</li>
						<li>신규펀딩</li>
						<li>종료임박</li>
					</ul>
				</section>
				<section class="page-select">
					<h1 class="hidden">메인펀딩 페이징</h1>
					<div class="prev-select"></div>
					<div class="next-select"></div>
				</section>
				<section class="funding-select">
					<h1 class="hidden">메인펀딩</h1>
					<div class="info-select">
						<div class="info-title">펀딩</div>
						<div class="info-content">가치 있는 소비가<br>세상을 바꾸는 이들을<br>응원합니다</div>
						<table class="info-count">
							<tr>
								<td>참여</td>
								<td>000명</td>
							</tr>
							<tr>
								<td>참여금액</td>
								<td>0,000,000원</td>
							</tr>
						</table>
						<div class="info-more"><a href="/blackswan2/funding/list">인기펀딩 보러가기</a></div>
						
					</div>
					<ul>
						<c:forEach begin="1" end="3">
						<li>
							<a href="">
								<div class="item-img">
									<img src="./images/.jpg">
								</div>
								<div class="item-info">
									<div class="title">댕냥이들의 장난감 !!!<br>집밖으로 나갈 수가 없어요</div>
									<div class="category"><span>카테고리</span><span>기업명</span></div>
									<div class="graph"><div class="percent" style="width: 80%"></div></div>
									<div class="gvalue"><span>40%</span><span>0,000,000원</span></div>
								</div>
							</a>
						</li>
						</c:forEach>
					</ul>
				</section>
			</div>
		</section>
	</main>

	<jsp:include page="inc/footer.jsp"/>	

</body>
</html>

