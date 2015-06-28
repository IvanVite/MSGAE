<%@ page import="java.util.List"%>
<%@ page import="com.ms.gae.model.entity.Industria"%>
<%@ page import="com.ms.gae.model.jdo.JDO"%>
	<%
	JDO<Industria> jdo1=JDO.getInstance(Industria.class);
	List<Industria> lista_ind=jdo1.findAll();
	 %>
		<table border="1" cellspacing="0" cellpadding="5">
			<tr><td colspan="3" align="center" >LISTA DE industria </td></tr>
			<tr><td calign="center" >ID</td><td calign="center" >NOMBRE</td><td calign="center" >DESCRIPCION</td></tr>
  				<%for(int i=0;i<lista_ind.size();i++){
					Industria industria=(Industria)lista_ind.get(i);
					out.print("<tr>");
					out.print("<td>"+industria.getNombre()+"</td>");
					out.print("<td>"+industria.getAsignadoA()+"</td>");
					out.print("</tr>");
				}%>
		</table>
	</body>
</html>
