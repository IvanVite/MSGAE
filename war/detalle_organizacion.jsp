<%@ page import="java.util.List"%>
<%@ page import="com.ms.gae.model.entity.Organizacion"%>
<%@ page import="com.ms.gae.model.entity.Industria"%>
<%@ page import="com.ms.gae.model.entity.Direccion"%>
<%@ page import="com.ms.gae.model.jdo.JDO"%>
<%@ page import="java.util.Date"%>

<%
JDO<Industria> jdo=JDO.getInstance(Industria.class);
Organizacion organizacion=(Organizacion)session.getAttribute("organizacion");
Industria industria =jdo.findByKey(organizacion.getIndustriaa());
%>
<h3> Informacion Organizacion</h3>
<td>
	<table width="100%" border="0" cellspacing="0" cellpadding="1">
		
		<tr>
  			<td>NOMBRE</td><td><%=organizacion.getNombre()%></td>
		</tr>
		<tr>
  			<td>CONTACTO PRINCIPAL</td><td><%=organizacion.getEmpleado()%></td>
		</tr>
		<tr>
   			<td>TELEFONO PRINCIPAL</td><td><%= organizacion.getTelefono() %></td>
		</tr>
		<tr>
    		<td>ASIGNADO A</td><td><%=(""+industria.getAsignadoA()+"")%></td>
  		</tr>
	</table>
</td>	