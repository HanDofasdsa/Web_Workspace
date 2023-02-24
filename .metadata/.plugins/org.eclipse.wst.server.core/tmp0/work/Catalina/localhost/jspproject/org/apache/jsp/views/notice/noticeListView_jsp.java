/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-02-24 00:14:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.notice.model.vo.Notice;
import com.kh.member.model.vo.Member;

public final class noticeListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/notice/../common/menubar.jsp", Long.valueOf(1677197515172L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.notice.model.vo.Notice");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Notice> list = (ArrayList<Notice>) request.getAttribute("list");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	.list-area{\r\n");
      out.write("		border: 1px solid white;\r\n");
      out.write("		text-align:center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.list-area>tbody>tr:hover{\r\n");
      out.write("		background:gray;\r\n");
      out.write("		cursor:pointer;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();

	Member loginUser = (Member) session.getAttribute("loginUser");
	// 로그인 전 : null값이 담김
	// 로그인 후 : 로그인한 회원의 Member객체
	
	String alertMsg = (String) session.getAttribute("alertMsg");
	// 모든 서비스 요청 전 : null
	//         요청 성공 : alert으로 띄워줄 메세지 문구 ex)로그인에 성공했습니다. 게시글등록에 성공했습니다
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Welcome C Class</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("	#login-form, #user-info {float: right}\r\n");
      out.write("	#user-info a{\r\n");
      out.write("		text-decoration:none; \r\n");
      out.write("		color:black;\r\n");
      out.write("		font-size:12px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.nav-area{background:black; }\r\n");
      out.write("	\r\n");
      out.write("	.menu {\r\n");
      out.write("		display:table-cell; /* 인라인 요소처럼 배치 가능*/\r\n");
      out.write("		height:50px;\r\n");
      out.write("		width:150px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.menu a {\r\n");
      out.write("		text-decoration:none;\r\n");
      out.write("		color : white;\r\n");
      out.write("		font-size: 20px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		display: block;\r\n");
      out.write("		width:100%;\r\n");
      out.write("		height:100%;\r\n");
      out.write("		\r\n");
      out.write("		line-height: 50px; /* 위 아래에서 가운데로 조정*/\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.menu a:hover{\r\n");
      out.write("		background:darkgray;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.outer{\r\n");
      out.write("		background: black;\r\n");
      out.write("		color:white;\r\n");
      out.write("		width:1000px;\r\n");
      out.write("		margin:auto;\r\n");
      out.write("		margin-top:50px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<script>\r\n");
      out.write("		const msg = \"");
      out.print( alertMsg  );
      out.write("\";\r\n");
      out.write("		\r\n");
      out.write("		if(msg != \"null\"){ // \"성공적으로 로그인이 되었습니다\" / \"null\"\r\n");
      out.write("			alert(msg);\r\n");
      out.write("			// 알람창을 띄워준 후 session에 담긴 메세지는 지워줘야함\r\n");
      out.write("			// 안그러면 menubar.jsp가 로딩될때마다 매번 alert함수가 실행됨\r\n");
      out.write("			");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("	<h1 align=\"center\">Welcome C Class</h1>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"login-area\">\r\n");
      out.write("		\r\n");
      out.write("		");
 if(loginUser == null) {
      out.write("\r\n");
      out.write("		<!-- 로그인 전에 보여지는 로그인 form -->\r\n");
      out.write("		<form id=\"login-form\" action=\"");
      out.print( request.getContextPath() );
      out.write("/login.me\" method=\"post\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>아이디 : </th>\r\n");
      out.write("					<td><input type=\"text\" name=\"userId\" required></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>비밀번호 : </th>\r\n");
      out.write("					<td><input type=\"password\" name=\"userPwd\" required></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th colspan=\"2\">\r\n");
      out.write("						<button>로그인</button>\r\n");
      out.write("						<button type=\"button\" onclick=\"enrollPage();\">회원가입</button>\r\n");
      out.write("					</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>			\r\n");
      out.write("		</form>\r\n");
      out.write("		<script>\r\n");
      out.write("			function enrollPage(){\r\n");
      out.write("				// location.href = \"");
      out.print( contextPath);
      out.write("/views/member/memberEnrollForm.jsp\"; 했을때 이동은가능\r\n");
      out.write("				// 웹애플리케이션의 디렉토리 구조가 url에 노출되면 보안에 취약\r\n");
      out.write("				\r\n");
      out.write("				// 단순한 정적인 페이지 이동요청이라고해도 반드시 servlet을 거쳐갈것 => url에 서블릿 매핑값만 노출되도록 하기\r\n");
      out.write("				location.href = \"");
      out.print( contextPath );
      out.write("/enrollForm.me\";\r\n");
      out.write("			}		\r\n");
      out.write("		</script>\r\n");
      out.write("		");
 } else { 
      out.write("\r\n");
      out.write("			<!-- 로그인 성공 후 -->\r\n");
      out.write("			<div id=\"user-info\">\r\n");
      out.write("				<b>");
      out.print( loginUser.getUserName() );
      out.write("</b>님 환영합니다.<br><br>\r\n");
      out.write("				<div align=\"center\">\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이페이지</a>\r\n");
      out.write("					<a href=\"");
      out.print(contextPath );
      out.write("/logout.me\">로그아웃</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>			\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<br clear=\"both\"> <!-- float 속성 해제 -->\r\n");
      out.write("	<br>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"nav-area\" align=\"center\">\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a></div>\r\n");
      out.write("		<div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항</a></div>\r\n");
      out.write("		<div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("/list.bo?currentPage=1\">일반게시판</a></div>\r\n");
      out.write("		<div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("/list.th\">사진게시판</a></div>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<div class=\"outer\">\r\n");
      out.write("		<br>\r\n");
      out.write("		<h2 align=\"center\">공지사항</h2>\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		<!--  공지사항게시판의 게시판은 관리자만 작성 가능함 -->\r\n");
      out.write("		");
 if(loginUser != null && loginUser.getUserId().equals("admin")){ 
      out.write("\r\n");
      out.write("			<div align=\"right\" style=\"width:850px;\">				\r\n");
      out.write("				<a href=\"");
      out.print(contextPath );
      out.write("/enrollForm.no\" class=\"btn btn-secondary\">글작성</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<table class=\"list-area\" align=\"center\">\r\n");
      out.write("			\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>글번호</th>\r\n");
      out.write("					<th width=\"400\">글제목</th>\r\n");
      out.write("					<th width=\"100\">작성자</th>\r\n");
      out.write("					<th>조회수</th>\r\n");
      out.write("					<th width=\"100\">작성일</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				<!-- <tr>\r\n");
      out.write("					<td>3</td>\r\n");
      out.write("					<td>제목~~~~</td>\r\n");
      out.write("					<td>admin</td>\r\n");
      out.write("					<td>123</td>\r\n");
      out.write("					<td>2020-03-03</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>2</td>\r\n");
      out.write("					<td>제목~~~~</td>\r\n");
      out.write("					<td>admin</td>\r\n");
      out.write("					<td>123</td>\r\n");
      out.write("					<td>2020-03-03</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>1</td>\r\n");
      out.write("					<td>제목~~~~</td>\r\n");
      out.write("					<td>admin</td>\r\n");
      out.write("					<td>123</td>\r\n");
      out.write("					<td>2020-03-03</td>\r\n");
      out.write("				</tr> -->\r\n");
      out.write("				");
 if(list.isEmpty()) { 
      out.write("\r\n");
      out.write("					<!-- 리스트가 비어있는 경우 -->\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td colspan=\"5\">존재하는 공지사항이 없습니다..</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				");
 } else { 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("					");
 for(Notice n : list) { 
      out.write("\r\n");
      out.write("						<tr onclick=\"moveNotice(");
      out.print( n.getNoticeNo() );
      out.write(")\">\r\n");
      out.write("							<td>");
      out.print(n.getNoticeNo() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(n.getNoticeTitle() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(n.getNoticeWriter() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(n.getCount() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(n.getCreateDate() );
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					");
 } 
      out.write("\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>		\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		function moveNotice(nno){\r\n");
      out.write("			\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		$(function(){\r\n");
      out.write("			\r\n");
      out.write("			$(\".list-area>tbody>tr\").click(function(){\r\n");
      out.write("				\r\n");
      out.write("				// 클릭했을때 해당 공지사항의 번호를 가져올수 있어야함.\r\n");
      out.write("				let nno = $(this).children().eq(0).text();\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				// get방식으로 요청시 url ? 붙여서 파라미터를 함께 전송할 수 있음\r\n");
      out.write("				// ?키=밸류&키=밸류\r\n");
      out.write("				// ?물음표 뒤의 내용들을 쿼리스트링이라고 부름\r\n");
      out.write("				// nno값은 클릭했을때 이동할 게시판의 글번호\r\n");
      out.write("				location.href = \"");
      out.print( contextPath);
      out.write("/detail.no?nno=\"+nno;\r\n");
      out.write("			});\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
