<%@ page import="java.util.List"%>
<%@ page import="com.ms.gae.model.entity.Organizacion"%>
<%@ page import="com.ms.gae.model.jdo.JDO"%>
	<%
	JDO<Organizacion> jdo=JDO.getInstance(Organizacion.class);
	List<Organizacion> lista_organizacion=jdo.findAll();
	 %>
	 <div align="center">
		<table border="1" cellspacing="0" cellpadding="5">
			<tr><td calign="center" >Nombre</td><td calign="center" >Contacto principal</td><td calign="center" >Telefono principal</td><td calign="center" >Asignado a</td><td calign="center" >Operacion</td></tr>
  				<%for(int i=0;i<lista_organizacion.size();i++){
					Organizacion organizacion=(Organizacion)lista_organizacion.get(i);
					out.print("<tr>");
					out.print("<td>"+organizacion.getNombre()+"</td>");
					out.print("<td>"+organizacion.getEmpleado()+"</td>");
					out.print("<td>"+organizacion.getTelefono()+"</td>");
					out.print("<td>"+organizacion.getDireccion().getFacturacion()+"</td>");
					out.print("<td>"+
									"<input type="+"submit"+" value="+"Editar"+">"+" "+
									"<input type="+"submit"+" value="+"Borrar"+">"
							+"</td>");
					out.print("</tr>");
				}%>
		</table>
		</div>
	</body>
</html>

