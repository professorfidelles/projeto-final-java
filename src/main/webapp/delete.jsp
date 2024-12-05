<%@page import="controller.AlunoDao"%>
<%
	AlunoDao dao = new AlunoDao();
	String id = request.getParameter("id");
	dao.deletar(Integer.parseInt(id));
	response.sendRedirect("index.jsp");
%>