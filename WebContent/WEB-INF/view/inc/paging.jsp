<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="p" value="${(empty param.page) ? 1 : param.page}" />
<c:set var="start" value="${p - (p-1)%5}" />

<section id="paging">
	<h1 class="hidden">페이저</h1>
	<div class="prev-page">
		<a href="list?page=${start==1? 1:start-1}">이전</a>
	</div>
	<ul>
		<c:forEach var="n" begin="${start}" end="${start+4}" varStatus="s">
			<li><a href="list?page=${n}">${n}</a></li>
		</c:forEach>
	</ul>
	<div class="next-page">
		<a href="list?page=${start+5}">다음</a>
	</div>
</section>