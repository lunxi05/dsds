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


<!-- --- Body block ---------------------------------------------------------------------------------------------------------------- -->
<div id="body">
    <div class="content-box">


 	<main>
            <section id="review">
                <form action="reg" method="post">
                <h1>리뷰 등록</h1>
                <table>
                    
                    <tbody>
                    	<tr>
                    		<th>제목</th>
                    		<td><input name ="title"></td>
                        </tr>
						<tr>
                    		<th>작성일</th>
                    		<td>${review.regDate}</td>
                        </tr>
						<tr>
                    		<th>내용</th>
                    		<td><textarea name="content"></textarea></td>
                        </tr>
                    </tbody>
                </table>
	           <div>
	  
	         	<input type="submit" value="저장">
	         	<a href="list">취소</a>
	           </div>
                </form>
            </section>


    </main>
    </div>
</div>

</body>

</html>