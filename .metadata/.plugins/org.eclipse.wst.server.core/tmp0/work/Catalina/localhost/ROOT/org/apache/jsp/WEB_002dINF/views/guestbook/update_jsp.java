/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-08-02 02:20:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.guestbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title> 방 명 록 </title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/summernote-lite.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	a { text-decoration: none;}\r\n");
      out.write("	table{width: 800px; border-collapse:collapse; text-align: center;}\r\n");
      out.write("	table,th,td{border: 1px solid black; padding: 3px}\r\n");
      out.write("	div{width: 800px; margin:auto; text-align: center;}\r\n");
      out.write("	.note-btn-group{width: auto;}\r\n");
      out.write("	.note-toolbar{width: auto;}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function save_go(f) {\r\n");
      out.write("		// 자바스크립트에서도 El를 사용할수 있다\r\n");
      out.write("		// 변수에다 저장해놓고 쓰면편하다\r\n");
      out.write("		var k = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gvo.pwd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("		if(f.pwd.value == k){		\r\n");
      out.write("		f.action=\"/guestbook_edite.do\";\r\n");
      out.write("		f.submit();\r\n");
      out.write("		}else{\r\n");
      out.write("			alert('비밀번호가 틀립니다.'); //알림창을 뛰운다\r\n");
      out.write("			f.pwd.value=\"\"; //비밀번호 입력한거 지운다\r\n");
      out.write("			f.pwd.focus(); // 입력창에 다시 커서를 가져다 놓는다 \r\n");
      out.write("			return;// 다시돌아간다\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		<h2>방명록 : 작성화면</h2>\r\n");
      out.write("		<hr />\r\n");
      out.write("		<p>[<a href=\"/guestbook_list.do\">목록으로 이동</a>]</p>\r\n");
      out.write("		<form method=\"post\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("					<td bgcolor=\"#99ccff\">작성자</td>\r\n");
      out.write("					<td><input type=\"text\" name=\"name\" size =\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gvo.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("					<td bgcolor=\"#99ccff\">제  목</td>\r\n");
      out.write("					<td><input type=\"text\" name=\"subject\" size =\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gvo.subject }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("					<td bgcolor=\"#99ccff\">email</td>\r\n");
      out.write("					<td><input type=\"text\" name=\"email\" size =\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gvo.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("					<td bgcolor=\"#99ccff\">비밀번호</td>\r\n");
      out.write("					<td><input type=\"password\" name=\"pwd\" size =\"20\"/></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("					<td colspan=\"2\">\r\n");
      out.write("						<textarea rows=\"10\" cols=\"60\" name=\"content\" id=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gvo.content }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tfoot>\r\n");
      out.write("					<tr align=\"center\">\r\n");
      out.write("						<td colspan=\"2\">\r\n");
      out.write("							<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gvo.m_idx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"m_idx\">\r\n");
      out.write("							<input type=\"button\" value=\"저장\" onclick=\"save_go(this.form)\" />\r\n");
      out.write("							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("							<input type=\"reset\" value=\"취소\" />\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tfoot>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    	<script src=\"resources/js/summernote-lite.js\"></script>\r\n");
      out.write("    	<script src=\"resources/js/lang/summernote-ko-KR.js\"></script>\r\n");
      out.write("    	<script type=\"text/javascript\">\r\n");
      out.write("    	$(function(){\r\n");
      out.write("    		$('#content').summernote({\r\n");
      out.write("    			lang : 'ko-KR',\r\n");
      out.write("    			height : 300,\r\n");
      out.write("    			focus : true,\r\n");
      out.write("    			callbacks : {\r\n");
      out.write("    				onImageUpload :  function(files, editor){\r\n");
      out.write("    					for (var i = 0; i < files.length; i++) {\r\n");
      out.write("							sendImage(files[i], editor);\r\n");
      out.write("						}\r\n");
      out.write("    				}\r\n");
      out.write("    			}\r\n");
      out.write("			});\r\n");
      out.write("    	});\r\n");
      out.write("    	function sendImage(file, editor) {\r\n");
      out.write("			var frm = new FormData();\r\n");
      out.write("			frm.append(\"s_file\",file);\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/saveImage.do\",\r\n");
      out.write("				data : frm,\r\n");
      out.write("				type : \"post\",\r\n");
      out.write("				contentType : false,\r\n");
      out.write("				processData : false,\r\n");
      out.write("				dataType : \"json\",\r\n");
      out.write("			}).done(function(data) {\r\n");
      out.write("				var path = data.path;\r\n");
      out.write("				var fname = data.fname;\r\n");
      out.write("				alert(\"path : \"+path+\"\\nfname : \"+fname);\r\n");
      out.write("				$(\"#content\").summernote(\"editor.insertImage\",path+\"/\"+fname);\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("    	\r\n");
      out.write("    	</script>\r\n");
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
