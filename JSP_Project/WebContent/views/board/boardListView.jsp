<%@ page import="com.kh.common.model.vo.PageInfo, java.util.ArrayList, com.kh.board.model.vo.Board" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PageInfo pi = (PageInfo) request.getAttribute("pi");
	ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("list");

	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();
%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
`
	.list-area{
		border :1px solid white;
		text-align:center;
	}
	
	.list-area>tbody>tr:hover{
		background:gray;
		cursor:pointer;
	}
	
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<br>
		<h2 align="center">일반게시판</h2>
		<br>
		
		<!-- 글등록버튼(로그인한 회원만 보이도록) -->
		<% if(loginUser != null) { %>
			<div align="right" style="width:850px">
				<a href="<%=contextPath %>/insert.bo" class="btn btn-secondary">글작성</a>
				<br><br>
			</div>
		<% } %>
		
		<table class="list-area" align="center">
			<thead>
				<tr>
					<th width="70">글번호</th>
					<th width="70">카테고리</th>
					<th width="300">제목</th>
					<th width="100">작성자</th>
					<th width="50">조회수</th>
					<th width="100">작성일</th>
				</tr>
			</thead>
			<tbody>
				<% if(list.isEmpty()) {%>
					<tr>
						<td colspan="6">조회된 리스트가 없습니다..</td>
					</tr>
				<% } else { %>
					<% for(Board b  :  list) { %>
						<tr>
							<td><%= b.getBoardNo() %></td>
							<td><%= b.getCategory() %></td>
							<td><%= b.getBoardTitle() %></td>
							<td><%= b.getBoardWriter() %></td>
							<td><%= b.getCount() %></td>
							<td><%= b.getCreateDate() %></td>
						</tr>
					<% } %>
				<% } %>
			</tbody>
		</table>
		<script>
			$(function(){
				$(".list-area>tbody>tr").click(function(){
					
					// 클릭시 해당 공지사항의 글번호를 알와야함.
					// tr요소의 자손중에서 첫번째 td태그의 영역안의 내용을 가져올 예정
					
					let bno = $(this).children().eq(0).text();
					//현재 내가 클릭한 tr의 자손들중 0번째에 위치한 자식의 textNode값을 가져온다.
					
					//요청할 url?키=밸류&키=밸류
					// 물음표 뒤의 내용을 쿼리스트링이라고 부름 => 직접 만들어서 넘겨줘야한다.
					location.href = '<%= contextPath %>/detail.bo?bno='+bno;
				});
			});
		</script>
	
		<br><br>
		
		<!--  페이징바 영역 -->
		
		<div align="center" class="paging-area">
			
			<% if(currentPage != 1) { %>
				<button onclick="location.href = '<%=contextPath %>/list.bo?currentPage=<%= currentPage -1 %>'">&lt;</button>
			<% } %>
			
			<% for(int i = startPage; i <= endPage; i++ ) { %>
				
				<% if(i != currentPage) { %>
					<button onclick="location.href = '<%=contextPath%>/list.bo?currentPage=<%= i %>'; "><%= i %></button>
				<% } else { %>
					<button disabled><%=i %></button>
				<% } %>
				
			<% } %>
			
			<% if(currentPage != maxPage) { %>
				<button onclick="location.href = '<%=contextPath %>/list.bo?currentPage=<%=currentPage + 1 %>' ">&gt;</button>
			<% } %>
			
		</div>
	
	</div>

</body>
</html>