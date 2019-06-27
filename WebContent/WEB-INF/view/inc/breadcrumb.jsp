<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
				case "qna":
					document.write("고객센터");
					break;
				case "member":
					document.write("회원");
				}
			</script></li>
			<li><script>
				var url = window.location.pathname;
				var bread = url.split("/")[3];
				switch (bread) {
				case "reg":
					document.write("등록하기");
					break;
				case "list":
					document.write("목록보기");
					break;
				case "detail":
					document.write("상세보기");
				case "qna":
					document.write("고객센터");
					break;
				}
			</script></li>
		</ul>
	</div>
</section>