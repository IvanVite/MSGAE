<body>
<form action="<%=application.getAttribute("CONTROLLER").toString()%>/Agregar/Industria" method="post" enctype="application/x-www-form-urlencoded">
	<table id="registro" width="110" border="0" cellspacing="0" cellpadding="5">
		<tr align="center">
			<td colspan="2" align="center">DATOS INDUSTRIA</td>
		</tr>
		<tr>
			<td>Nombre</td>
			<td><input name="nombre" type="text"> </td>
		</tr>
		<tr>
			<td>Tipo</td>
			<td><input name="tipo_i" type="text"> </td>
		</tr>
		<tr>
			<td>Asignado A</td>
			<td><input name="asignadoA" type="text"></td>
		</tr>
  		<tr align="center">
    		<td colspan="2" align="center"><input type="submit" value="Guargar"></td>
  		</tr>
	</table>
</form>
</body>