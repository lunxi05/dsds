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
<link rel="stylesheet" type="text/css" href="../css/funding.css">
</head>

 
<body>
	<h1 class="hidden">BLACKSWAN</h1>
 	<jsp:include page="../inc/header.jsp"/>	

	<main>
		<jsp:include page="../inc/nav.jsp"/>
	
		<section id="main">
			<h1 class="hidden">메인컨텐츠</h1>
			<div class="center">
				<section class="count-option">
					<h1 class="hidden">펀딩수 및 정렬옵션</h1>
					<div class="list-count"><span>전체</span><span>410</span></div>
					<div class="list-option">
						<input type="checkbox" id="check"><label for="check">성공한 펀딩 보기</label>
						<select>
							<option>종료임박순</option>
							<option>인기순</option>
							<option>최신순</option>
							<option>참여율순</option>
						</select>
					</div>
				</section>
				<section class="funding-list">
					<h1 class="hidden">펀딩 리스트</h1>
					<ul>
						<!-- 1페이지일때만 노출 -->
						<li class="first-page-img">
						</li>
						<c:forEach begin="1" end="7">
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
				<section class="paging">
					<h1 class="hidden">페이저</h1>
					<div class="first-page"><a href=""></a></div>
					<div class="prev-page"><a href=""></a></div>
					<ul>
						<li><a href="">1</a></li>
						<li><a href="">2</a></li>
						<li><a href="">3</a></li>
						<li><a href="">4</a></li>
						<li><a href="">5</a></li>
						<li><a href="">6</a></li>
						<li><a href="">7</a></li>
						<li><a href="">8</a></li>
						<li><a href="">9</a></li>
						<li><a href="">10</a></li>
					</ul>
					<div class="next-page"><a href=""></a></div>
					<div class="end-page"><a href=""></a></div>
				</section>
			</div>
		</section>
	</main>

	<jsp:include page="../inc/footer.jsp"/>	

</body>
</html>

