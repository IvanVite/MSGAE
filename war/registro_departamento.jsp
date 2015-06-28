<body>
<form action="<%=application.getAttribute("CONTROLLER").toString()%>/Agregar/Departamento" method="post" enctype="application/x-www-form-urlencoded">
	<table id="registro" width="110" border="0" cellspacing="0" cellpadding="5">
		<tr align="center">
			<td colspan="2" align="center">DATOS</td>
		</tr>
		<tr>
			<td>NOMBRE</td>
			<td><input name="nombre" type="text"> </td>
		</tr>
		<tr>
			<td>DESCRIPCIÓN</td>
			<td><textarea name="descripcion" cols="20" rows="5"></textarea></td>
		</tr>
  		<tr align="center">
    		<td colspan="2" align="center"><input type="submit" value="Guargar"></td>
  		</tr>
	</table>
</form>
<br/>

<h3>Nueva organización</h3>
<hr width=100% align="left">
<form action="<%=application.getAttribute("CONTROLLER").toString()%>/Agregar/Organizacion" method="post" enctype="application/x-www-form-urlencoded">
	<table id="tablaeOrganizacion">
		<tr>
			<td>Nombre de la organizacion</td>
			<td><input type="text"></td>
			<td>Sitio Web</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>Telefono Primerio</td>
			<td><input type="text"></td>
			<td>Empleados</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>Correo Primario</td>
			<td><input type="text"></td>
			<td>Correo Secundario</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>Ingreso anual</td>
			<td><input type="text"></td>
			<td>Industria</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>Tipo</td>
			<td><select></select></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>Asignado a</td>
			<td><select></select></td>
		</tr>
	</table>
	<br/>
	<h3>Direccion</h3>
	<hr width=100% align="left">
	<table id="tablaeOrganizacion">
		<tr>
			<td>Direccion Facturacion</td>
			<td><input type="text"></td>
			<td>Direccion de envio</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>Ciudad</td>
			<td><input type="text"></td>
			<td>Ciudad</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>Estado</td>
			<td><input type="text"></td>
			<td>Estado</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>CP</td>
			<td><input type="text"></td>
			<td>CP</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>Pais</td>
			<td><input type="text"></td>
			<td>Pais</td>
			<td><input type="text"></td>
		</tr>
	</table>
	<h3>Comentarios</h3>
	<hr width=100% align="left">
	<table>
		<tr>
			<td>Comentarios</td>
			<td><textarea name="descripcion" cols="20" rows="5"></textarea></td>
		</tr>
	</table>
	<div align="right">
    	<input type="submit" value="Guargar">
  	</div>
</form>

</body>