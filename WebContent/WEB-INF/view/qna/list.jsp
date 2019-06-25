<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Black Swan QnA</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
<jsp:include page="../inc/header.jsp"/>	
	
	
	
	<div id="body">
		<div class="content-box">
			

			<main>
			<section id="main">
				<h1>공지사항</h1>
				
				<section id="notice-search">
					<h1 class="d-none">qna 검색</h1>
					<form>
						<select>
							<option>제목</option>
							<option>작성자</option>
							<option>내용</option>
						</select> <input type="text"> <input type="submit" value="검색">
					</form>
				</section>
				<section id="notice">
					<h1 class="d-none">qna 목록</h1>
					<form method="post">
						<table>
							<thead class="notice-header">
								<tr>
									<td class="id">관리자 qna 넘버</td>
									<td class="admin_id">관리자 넘버</td>
									<td class="member_id">회원 넘버</td>
									<td class="hit">조회수</td>
									<td class="title">제목</td>
									<td class="content">내용</td>
									<td class="writer">작성자</td>
									<td class="regdate">작성일</td>
									<td class="reply">답글</td>
									<td class="r-date">답글 일자</td>
									<td class="hit">조회수</td>
									<td class="secretnum">비밀번호</td>
									<td class="state">글상태</td>
								</tr>
							</thead>
							<tbody class="qna-body">
		 						<c:forEach var="q" items="${qlist}">
		 						<tr>
									<td class="id">관리자 qna 넘버</td>
									<td class="admin_id">관리자 넘버</td>
									<td class="member_id">회원 넘버</td>
									<td class="hit">조회수</td>
									<td class="title">제목</td>
									<td class="content">내용</td>
									<td class="writer">작성자</td>
									<td class="regdate">작성일</td>
									<td class="reply">답글</td>
									<td class="r-date">답글 일자</td>
									<td class="hit">조회수</td>
									<td class="secretnum">비밀번호</td>
									<td class="state">글상태</td>
		 						</tr>
		 						
		 						
		 						
									<tr>
										<td class="num">${q.id}</td>
										<td class="title">
											<a href="detail?id=${q.id}">${q.title}</a>
											<span>${q.content}</span>
										</td>
										<td class="writer">${q.writerId}</td>
										<td class="date">${q.regDate}</td>
										<td class="hit">${q.hit}</td>
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
						<c:forEach var="q" begin="${start}" end="${start+4}" varStatus ="s">
						<li><a href="list?p=${q}" > ${q}</a></li>
						
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