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
						<label>펀딩 목록</label>
						<select name="selectPR">
						<option>tjsd</option>
						
						<c:forEach var="f" item="${fpr}">
						
						<option>${f. }원 펀딩하기
							증기로쪄서 만든 말랑말랑 소프트밥 소고기 3kg +150g
							배송비 : 2500원 
							발송예상일 : 2019년7월중순(11일~20일) 예정</option>
						</c:forEach>
						
						
						
						</select>
						<div>
							<label for="payPR">펀딩 금액</label><input type="date" name="query" id="member-reg">
							
						</div>
						
					</div>
				</form>
			</section>
		</main>	
	</div>
</body>
</html>