<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en" >

<head>
    <title>Document</title>
</head>

<body>
    <!-- --- header block ---------------------------------------------------------------------------------------------------------------- -->
 <jsp:include page=""></jsp:include>

<!-- --- Body block ---------------------------------------------------------------------------------------------------------------- -->
<div id="body">
    <div class="content-box">

    <jsp:include page=""/>

 	<main>
            <section id="review">
                <h1>리뷰 상세페이지</h1>
                <table>
                    
                    <tbody>
                    	<tr>
                    		<th>제목</th>
                    		<td>${review.title}</td>
                        </tr>
						<tr>
                    		<th>작성일</th>
                    		<td>${review.regDate}</td>
                        </tr>
						<tr>
                    		<th>내용</th>
                    		<td>${review.content}</td>
                        </tr>
                    </tbody>
                </table>
            </section>

           <div>
         	<a href="edit?id=${review.id}">수정</a>
         	<a href="del?id=${review.id}">삭제</a>
           </div>

            <section id="pager">
                <h1></h1>
           <ul>
             <li><a href="detail?id=${prev.id}"><span>이전글</span>${prev.title}</a></li>
             <li><a href="detail?id=${next.id}"><span>다음글</span>${next.title}</a></li>
           </ul>
            </section>
    </main>
    </div>
</div>
<!-- --- footer block ---------------------------------------------------------------------------------------------------------------- -->
    <jsp:include page=""/>

</body>

</html>