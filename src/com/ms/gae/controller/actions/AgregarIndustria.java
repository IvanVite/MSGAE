package com.ms.gae.controller.actions;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import com.ms.gae.model.entity.Industria;
import com.ms.gae.model.jdo.JDO;

public class AgregarIndustria extends Action implements Serializable{
	
	private static final long serialVersionUID = 8175543372537617263L;
	@SuppressWarnings("unchecked")
	public void run() throws ServletException, IOException {
		try {
			Industria industria = new Industria();
			industria.setNombre(request.getParameter("nombre"));
			industria.setTipo(request.getParameter("tipo_i"));
			industria.setAsignadoA(request.getParameter("asignadoA") );
			jdo = JDO.getInstance(Industria.class);
			jdo.insert(industria);
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		RequestDispatcher rd = application.getRequestDispatcher("/index.jsp?pagina=ri");
		if (rd == null) {
			throw new ServletException("Pagina no encontrada");
		}
		rd.forward(request,response);
	}
	
}
