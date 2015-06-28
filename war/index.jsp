<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="WEB-INF/InitModel.jsp"%>

<html>
<head>

<title>GAE LOCAL</title>
<style type="text/css">
<%@ include file="estilo.css"%>
</style>
</head>

<body>
			<a href="<%=application.getAttribute("ABSOLUTEURL")%>index.jsp">MENU</a>
				<p>Organizacion: </p>
							<ul>
							<!--li><a href="index.jsp?pagina=gd">Nueva organización</a></li-->
							<li><a href="index.jsp?pagina=ro">Nueva Organización</a></li>
							<li><a href="index.jsp?pagina=lo">Información Organización</a></li>
							</ul>
				<p>Empleados</p>
						<ul>
							<li><a href="index.jsp?pagina=ge">Empleados</a></li>
						</ul>
					
				
				
				<br/>
				<hr width=80% align="left">
				<br/>
				<%
					String pagina = request.getParameter("pagina");
					if (pagina == null) {pagina = "";}
				%>
				<%if (pagina.matches("ro")) {%>
					<%@ include file="registro_organizacion.jsp"%>
				<%}%>
				<%if (pagina.matches("do")) {%>
					<%@ include file="detalle_organizacion.jsp" %>
				<%} %>
				<%if (pagina.matches("lo")) {%>
					<%@ include file="lista_organizacion.jsp" %>
				<%} %>
				<%if (pagina.matches("ri")) {%>
					<%@ include file="registro_industria.jsp" %>
				<%} %>
				<%if (pagina.matches("gd")) {%> 
			 		<%@ include file="gestion_departamento.jsp"%> 
			 	<%}%>
				<%if (pagina.matches("re")) {%>
					<%@ include file="registro_empleado.jsp" %>
				<%} %>
 				<%if (pagina.matches("ge")) {%>
					<%@ include file="gestion_empleado.jsp"%>
				<%}%>
				<%if (pagina.matches("le")) {%>
					<%@ include file="listar_empleado.jsp"%>
				<%}%>
				<%if (pagina.matches("ld")) {%>
					<%@ include file="listar_departamento.jsp"%>
				<%}%>
				
</body>
</html>
