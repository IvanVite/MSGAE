package com.ms.gae.controller.actions;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;

import com.ms.gae.model.entity.Direccion;
import com.ms.gae.model.jdo.JDO;

public class AgregarDireccion extends Action implements Serializable {

	private static final long serialVersionUID = -5698990164503275579L;

	@SuppressWarnings("unchecked")
	public void run() throws ServletException, IOException {
		try {
			Direccion direccion = new Direccion();
			direccion.setFacturacion(request.getParameter("facturacion"));
			direccion.setCuidad_f(request.getParameter("cuidad_f"));
			direccion.setEstado_f(request.getParameter("estado_f"));
			direccion.setCp_f(Integer.parseInt(request.getParameter("cp_f")));
			direccion.setPais_f(request.getParameter("pais_f"));
			direccion.setEnvio(request.getParameter("envio"));
			direccion.setCuidad_e(request.getParameter("cuidad_e"));
			direccion.setEstado_e(request.getParameter("estado_e"));
			direccion.setCp_e(Integer.parseInt(request.getParameter("cp_e")));
			direccion.setPais_e(request.getParameter("pais_e"));
			
			jdo = JDO.getInstance(Direccion.class);
			jdo.insert(direccion);
			
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		
	}

}
