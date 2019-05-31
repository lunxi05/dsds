<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
가나다라마바사
<br>
<c:forEach var="m" items="${member}">

${m.num} | ${m.id} | ${m.black} | ${m.email} | ${m.name} | ${m.regdate} | ${m.condition}<br>
</c:forEach>


</body>
</html>