<%@page import="controller.AlunoDao"%>
<%@page import="model.Aluno"%>
<%
	String nome = request.getParameter("nome");
	String cpf = request.getParameter("cpf");
	String email = request.getParameter("email");
	
	if(nome != null && nome != "" && cpf != null && cpf != "" && email != null && email != ""){
		Aluno aluno = new Aluno();
		AlunoDao dao = new AlunoDao();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		dao.inserir(aluno);
		response.sendRedirect("index.jsp");
		
	}else{
		response.sendRedirect("inserir.jsp");
	}

%>