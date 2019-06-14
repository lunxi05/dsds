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
<link rel="stylesheet" type="text/css" href="../css/notice.css">
</head>

 
<body>
	<h1 class="hidden">BLACKSWAN</h1>
	<jsp:include page="../inc/header.jsp"/>	


	<main>
		<section id="breadcrumb">
			<h1 class="hidden">경로</h1>
			<div class="center">
				<ul>
					<li><a href="/index">홈</a></li>
					<li><a href="">Q&A</a></li>
					<li><a href="">공지사항</a></li>
				</ul>
			</div>
		</section>
	
			<h1 >공지사항</h1>
			<div class="center">
			<table >
                    <thead>
                        <tr>
                            <td class="id">번호</td>
                            <td class="division">구분</td>
                            <td class="title">제목</td>
                            <td class="date">작성일</td>
                            <td class="hit">조회수</td>
                        </tr>
                    </thead>

                    <tbody>
                    
                      <c:forEach var="n" items="${list}" varStatus="s">
                       <tr>
                           <td class="id">${n.id}</td>
                           <td class="division">${n.division}</td>
                           <td class="title">
                           	<a href="detail?id=${n.id}">${n.title}</a>
                           </td>
                           <td class="date">${n.regDate}</td>
                           <td class="hit">${n.hit}</td>
                        </tr>
                       </c:forEach>
                    </tbody>
                </table>
                
				<section id="page-index">
                <h1 class="d-none">페이지 정보</h1>
                <div>
                    <span class="color-highlight font-bold">1</span>
                     / 1 pages
                </div>
            </section>

			<c:set var="page" value="${(empty param.p) ? 1:param.p}" />
			<c:set var="start" value="${page-(page-1)%5}" />
			<c:set var="last" value="${page-(page-1)%5}" />
			

            <section id="pager">
                <h1 class="d-none">페이지</h1>
                <div>
                    <div><a href="list?p=${(start==1) ? 1 : start-1}">이전</a></div><%-- ${(page<6)?page:page-5} --%>
                    <ul>
                        <c:forEach var="n" begin="${start}" end="${start+4}" varStatus="s">
                        <li><a href ="list?p=${n}">${n}</a></li>
                        </c:forEach>
                    </ul>
                    <div class="icon-next-page">다음</div>
                </div>
            </section>
			</div>
	</main>

	<jsp:include page="../inc/footer.jsp"/>	

</body>
</html>