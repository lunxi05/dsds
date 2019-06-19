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
<link rel="stylesheet" type="text/css" href=".././css/funding.css">


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

		<section id="funding-title">
			<h1>${funding.title}</h1>
			<div class="category">${funding.categoryId}</div>
		</section>

		<section id="funding-tap">
			<h1 class="hidden">펀딩 탭</h1>
			<div class="center">
				<ul>
					<li>스토리 소개</li>
					<li>펀딩후기</li>
					<li>Q&A</li>
					<li>환불 및 교환</li>
					<li>창작자 소개</li>
				</ul>
			</div>
		</section>

		<section id="funding-content">
			<h1 class="hidden">펀딩 내용</h1>
			<div class="center">
				<%-- 				<div>					
					<br> <br>
					${funding.sdate}<br> ${funding.edate}<br> ${funding.hit}<br>
				</div> --%>
				<section class="funding-detail">
					<h1 class="hidden">펀딩 소개</h1>
					<section class="funding-visual">
						<h1 class="hidden">펀딩 이미지</h1>
						<div class="funding-img">
							<img src="${funding.introImg}">
							<div class="prev-banner"></div>
							<div class="next-banner"></div>
						</div>
						<div class="funding-caution">
							<div class="funding-goal">
								<span>목표금액</span> <span>${funding.tAmount}</span> <span>펀딩기간</span>
								<span>${funding.sdate} ~ ${funding.edate}</span>
							</div>
						</div>
					</section>
					<section class="funding-intro">
						<h1>스토리 소개</h1>
	
					</section>
				</section>
				<section class="funding-info">
					<h1 class="hidden">펀딩 안내</h1>
					<section class="funding-current">
						<h1 class="hidden">펀딩 상황</h1>
						<div class="funding-goal">
							<div>
								<span>모인금액</span> <span>nnn,nnn,nnn원</span> <span>${funding.tAmount}원
									목표</span>
							</div>
							<div class="circle">nn%</div>
						</div>
						<table>
							<tr>
								<td>참여인원</td>
								<td>nnn명</td>
							</tr>
							<tr>
								<td>마감일</td>
								<td>${funding.edate}</td>
							</tr>
						</table>
						<div class="funding-attend">
							<input type="button" value="참여하기">
						</div>
					</section>

					<section class="funding-item">
						<!-- 반복문 써서 돌리기 -->
						<h1 class="hidden">펀딩 아이템</h1>
						<div class="current-item">
							<div class="label">nnn원 펀딩옵션 가격</div>
							<div class="data">펀딩옵션 내용</div>
							<div class="label">배송비</div>
							<div class="data">2,500원</div>
							<div class="label">펀딩 발송 시작일</div>
							<div class="data">2019년 0데이터 받아오기</div>
							<div class="funding-count">
								<span>현재 /받아오기~~~/ 개 남음!</span> <span>제한수량 100개</span>
							</div>
							<div class="funding-join">총 /받아오기~~~~/개 펀딩완료</div>
						</div>
					</section>
				</section>

			</div>
		</section>
	</section>
	</main>
	
	<jsp:include page="../inc/footer.jsp"/>
</body>

</html>