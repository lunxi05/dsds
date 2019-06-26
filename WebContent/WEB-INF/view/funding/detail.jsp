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
			<div class="category">${funding.cateName}</div>
		</section>

		<section id="funding-tab">
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
						<div class="funding-img" value="${funding.introImg}">
							<img src="https://happybean-phinf.pstatic.net/20190516_270/1557995844250za2Lj_JPEG/00.jpg?type=w720">
							<div class="prev-banner"></div>
							<div class="next-banner"></div>
						</div>
						<div class="funding-caution">
							<div class="static-span">
								<span>목표금액</span>
								<span>${funding.tAmount}</span>
								<span>펀딩기간</span>
								<span>${funding.sdate} ~ ${funding.edate}</span>
							</div>
							<div class="static-message">
								100% 이상 모이면 펀딩이 성공되는 프로젝트<br>
								이 프로젝트는 펀딩 마감일까지 목표 금액이 100% 모이지 않으면 결제가 진행되지 않습니다.
							</div>
						</div>
					</section>
					<section class="funding-intro">
						<h1>스토리 소개</h1>
						<div>
							${funding.content}
						</div>
					</section>
				</section>
				<section class="funding-info">
					<h1 class="hidden">펀딩 안내</h1>
					<section class="funding-current">
						<h1 class="hidden">펀딩 상황</h1>
						<div class="funding-goal">
							<div>
								<span>모인금액</span>
								<span>${funding.pay}원</span>
								<span>${funding.tAmount}원 목표</span>
							</div>
							<div class="circle">${funding.partRate}</div>
						</div>
						<table>
							<tr>
								<td>참여인원</td>
								<td>${funding.payc}명</td>
							</tr>
							<tr>
								<td>마감일</td>
								<td>${funding.edate}</td>
							</tr>
						</table>
						<div class="funding-attend">
							<input type="button" value="참여하기">
							<div>
								참여 금액별 리워드 보기
							</div>
						</div>
					</section>

					<c:forEach var="p" items="${price}">
					<section class="funding-item">
						<h1 class="hidden">펀딩 아이템</h1>
							<div class="price"><span>${p.rPrice}</span>원</div>
							<div class="foption">
								<span>${p.rContent}</span>
								<br>
								<span>발송 예상일 몇년 몇월 받기</span>
							</div>
							<div class="fcount">
								<img src=".././images/check.png"><span>00명 참여</span> <span>00개 남음</span>
							</div>
					</section>
					</c:forEach>
					
				</section>

			</div>
		</section>
	</section>
	</main>
	
	<jsp:include page="../inc/footer.jsp"/>
</body>

</html>