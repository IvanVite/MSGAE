package com.ms.gae.controller.actions;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import com.ms.gae.model.entity.Departamento;
import com.ms.gae.model.entity.Direccion;
import com.ms.gae.model.entity.Industria;
import com.ms.gae.model.entity.Organizacion;
import com.ms.gae.model.jdo.JDO;

public class AgregarOrganizacion extends Action implements Serializable{
	private static final long serialVersionUID = 6669751135255111047L;
	
	@SuppressWarnings("unchecked")
	public void run() throws ServletException, IOException {
		try {
		Organizacion organizacion = new Organizacion();
		organizacion.setNombre(request.getParameter("nombre"));
		organizacion.setDescripcion(request.getParameter("descripcion"));
		organizacion.setSitio_web(request.getParameter("sitio_web"));
		organizacion.setTelefono(Integer.parseInt(request.getParameter("telefono")));
		/*Podria ser entidad*/
		organizacion.setEmpleado(request.getParameter("empleado"));
		organizacion.setCorreo_p(request.getParameter("correo_p"));
		organizacion.setCorreo_s(request.getParameter("correo_s"));
		organizacion.setIngreso_anual(Double.parseDouble(request.getParameter("ingreso_anual")));
		/*Entidad Direccion*/
		jdo = JDO.getInstance(Industria.class);
		Industria industria = new Industria();
		industria.setNombre(request.getParameter("nombre"));
		industria.setTipo(request.getParameter("tipo_i"));
		industria.setAsignadoA(request.getParameter("asiganadoA"));
		/*Entidad direccion*/
		jdo= JDO.getInstance(Direccion.class);
		Direccion direccion = new Direccion();
		direccion.setFacturacion(request.getParameter("facturacion"));
		direccion.setCuidad_f(request.getParameter("cuidad_f"));
		direccion.setEstado_f(request.getParameter(""));
		direccion.setCp_f(Integer.parseInt(request.getParameter("cp_f")));
		direccion.setPais_f(request.getParameter("pais_f"));
		direccion.setEnvio(request.getParameter("envio"));
		direccion.setCuidad_e(request.getParameter("cuidad_e"));
		direccion.setEstado_e(request.getParameter("estado_e"));
		direccion.setCp_e(Integer.parseInt(request.getParameter("cp_e")));
		direccion.setPais_e(request.getParameter("pais_e"));
		organizacion.setDireccion(direccion);
		
		jdo = JDO.getInstance(Organizacion.class);
		jdo.insert(organizacion);
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		RequestDispatcher rd=application.getRequestDispatcher("/index.jsp?pagina=ro");
		if(rd==null){
			throw new ServletException("pagina no encontrada");
	}
		rd.forward(request,response);
	}

}
