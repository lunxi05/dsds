<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../inc/header.jsp"/>	
	
	<!--visual block ----------------------------------------------------------------------------------------------------------------- -->
	<div id="visual">
		<div class="content-box">
			<!--   <span>보보보언니</span> 
            <img src="http://blogfiles.naver.net/MjAxODA5MTZfMjgw/MDAxNTM3MTAzODg3NDcy.o6wYmuayCV2lYG8yuNX5nq0hJwhNsbe0r3Q15xG3j6wg.mn-aYPzUQ2VTss4BRxCyXR_m4aRVF10XZdcjmMaMZEog.JPEG.09mmjiyoon/20180916_1323505930.jpg">
            <span>바보바보바보야</span>
            <img src="http://post.phinf.naver.net/MjAxNzEyMDhfNDIg/MDAxNTEyNzIxNDUyMzc4.Vo9sfxImkLvkGHRC9XdDL24GKu47He19K-2CN-tfpmcg.UB3tvdcrSGLB1FUP5Njgx724jG1G7l_Ph56xZBY52XIg.JPEG/IcFL8dbgYvPz4T_yqWEoDWEIdGUw.jpg"> 
            -->
		</div>
	</div>

	<div id="body">
		<div class="content-box">
			<jsp:include page="../inc/aside.jsp"/>	

			<main>
			<section id="main">
				<h1>공지사항</h1>
				<section id="breadcrumb">
					<h1 class="d-none">경로</h1>
					<ol>
						<li>home</li>
						<li>고객센터</li>
						<li>공지사항</li>
					</ol>
				</section>
				<section id="notice-search">
					<h1 class="d-none">공지사항 검색</h1>
					<form>
						<select>
							<option>제목</option>
							<option>작성자</option>
							<option>내용</option>
						</select> <input type="text"> <input type="submit" value="검색">
					</form>
				</section>
				<section id="notice">
					<h1 class="d-none">공지사항 목록</h1>
					<form method="post">
						<table>
							<thead class="notice-header">
								<tr>
									<td class="num">번호</td>
									<td class="title">제목</td>
									<td class="writer">작성자</td>
									<td class="date">작성일</td>
									<td class="hit">조회수</td>
								</tr>
							</thead>
							<tbody class="notice-body">
							
									<style>
										.even {background: beige;}
									</style>
							
		 						<c:forEach var="n" items="${list}">
									<tr>
										<td class="num">${n.id}</td>
										<td class="title">
											<a href="detail?id=${n.id}">${n.title}</a>
											<span>${n.commentCount}</span>
										</td>
										<td class="writer">${n.writerId}</td>
										<td class="date">${n.regDate}</td>
										<td class="hit">${n.hit}</td>
									</tr>	
								</c:forEach>   
								
								<tr>
									<td colspan="5">----------------------</td>
								</tr>
								
		 						<c:forEach var="n" items="${list}" varStatus="s">
		 							<c:if test="${s.index%2==1}">
									<tr class="even">
		 							</c:if>
		 							<c:if test="${s.index%2==0}">
									<tr>
									</c:if>
										<td class="num">${n.id}</td>
										<td class="title">
											<a href="detail?id=${n.id}">${s.current.id} : ${n.title}</a>
											<span>${n.commentCount}</span>
										</td>
										<td class="writer">${n.writerId}</td>
										<td class="date">${n.regDate}</td>
										<td class="hit">${n.hit}</td>
									</tr>	
									
								</c:forEach>   
	
							</tbody>
						</table>
					</form>
				</section>
				<section id="page-index">
					<h1 class="d-none">페이지 정보</h1>
					<div>
						<span class="color-highlight font-bold">1</span> / 1 pages
					</div>
				</section>
				<c:set var="page" value="${(empty param.p)? 1: param.p}"/> 
				<c:set var="start" value = "${page-(page-1)%5}"/>
				<c:set var= "end" value=""/>
				<section id="pager">
					<h1 class="d-none">페이지</h1>
					<div>
						<div><a href="${(page<6)?page:page-5}"></a>이전</div>
	
						<ul>
						<c:forEach var="n" begin="${start}" end="${start+4}" varStatus ="s">
						<li><a href="list?p=${n}" > ${n}</a></li>
						
						</c:forEach>
							

						</ul>
						<div><a href="list?p=${start+5}"> 다음</a></div>
						
					</div>
				</section>
			</section>
			</main>
		</div>
	</div>



	<jsp:include page="../inc/footer.jsp"/>	

</body>
</html>