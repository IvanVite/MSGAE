<%@ page import="java.util.List"%>
<%@ page import="com.ms.gae.model.entity.Industria"%>
<%@ page import="com.ms.gae.model.entity.Direccion"%>
<%@ page import="com.ms.gae.model.jdo.JDO"%>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>
<body>
<form action="<%=application.getAttribute("CONTROLLER").toString()%>/Agregar/Organizacion" method="post">
<h3>Nueva organización</h3>
<hr width=80% align="left">
<div align="center" style="whitd:500px">
	<table id="tablaeOrganizacion" style="width:70%">
		<tr>
			<td>Nombre de la organizacion</td>
			<td><input name="nombre" type="text"></td>
			<td>Sitio Web</td>
			<td><input name="sitio_web" type="text"></td>
		</tr>
		<tr>
			<td>Telefono Primerio</td>
			<td><input name="telefono" type="text"></td>
			<td>Empleados</td>
			<td><input name="empleado" type="text"></td>
		</tr>
		<tr>
			<td>Correo Primario</td>
			<td><input name="correo_p" type="text"></td>
			<td>Correo Secundario</td>
			<td><input name="correo_s" type="text"></td>
		</tr>
		<tr>
			<td>Ingreso anual</td>
			<td><input name="ingreso_anual" type="text"></td>
			<td>Industria</td>
			<td>
				<select name="industria">
				<option value="null">--Seleccionar--</option>
				<%
				JDO<Industria> jdo1=JDO.getInstance(Industria.class);
				List<Industria> lista_ind_nombre=jdo1.findAll();
				for(int i=0;i<lista_ind_nombre.size();i++){
					Industria industria=lista_ind_nombre.get(i);
					out.print("<option value='"+industria.getKey()+"'>"+industria.getNombre()+"</option>");
				}%>
				</select>
			</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>Tipo</td>
			<td>
				<select name="industria">
				<option value="null">--Seleccionar--</option>
				<%
				JDO<Industria> jdo2=JDO.getInstance(Industria.class);
				List<Industria> lista_ind_tipo=jdo1.findAll();
				for(int i=0;i<lista_ind_tipo.size();i++){
					Industria industria=lista_ind_tipo.get(i);
					out.print("<option value='"+industria.getKey()+"'>"+industria.getTipo()+"</option>");
				}%>
				</select>
			</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>Asignado a</td>
			<td>
				<select name="industria">
				<option value="null">--Seleccionar--</option>
					<%
				JDO<Industria> jdo3=JDO.getInstance(Industria.class);
				List<Industria> lista_ind_asignado=jdo1.findAll();
				for(int i=0;i<lista_ind_asignado.size();i++){
					Industria industria=lista_ind_asignado.get(i);
					out.print("<option value='"+industria.getKey()+"'>"+industria.getAsignadoA()+"</option>");
				}%>
				</select>
			</td>
		</tr>
	</table>
	<br/>
	<div align="left"><h3>Direccion</h3></div>
	<hr width=80% align="left">
	<table id="tablaeOrganizacion" style="width:70%">
		<tr>
			<td>Direccion Facturacion</td>
			<td><input name="facturacion" type="text"></td>
			<td>Direccion de envio</td>
			<td><input name="envio" type="text"></td>
		</tr>
		<tr>
			<td>Ciudad</td>
			<td><input name="cuidad_f" type="text"></td>
			<td>Ciudad</td>
			<td><input name="cuidad_e" type="text"></td>
		</tr>
		<tr>
			<td>Estado</td>
			<td><input name="estado_f" type="text"></td>
			<td>Estado</td>
			<td><input name="estado_e" type="text"></td>
		</tr>
		<tr>
			<td>CP</td>
			<td><input name="cp_f" type="text"></td>
			<td>CP</td>
			<td><input name="cp_e" type="text"></td>
		</tr>
		<tr>
			<td>Pais</td>
			<td><input name="pais_f" type="text"></td>
			<td>Pais</td>
			<td><input name="pais_e" type="text"></td>
		</tr>
	</table>
	<div align="left"><h3>Comentarios</h3></div>
	<hr width=80% align="left">
	<table style="width:70%">
		<tr>
			<td>Comentarios</td>
			<td><textarea name="descripcion" cols="20" rows="5"></textarea></td>
		</tr>
	</table>
	<div align="right">
    	<input type="submit" value="Guargar">
  	</div>
  	</div>
</form>
</body>