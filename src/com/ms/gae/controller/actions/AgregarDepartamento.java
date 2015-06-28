package com.ms.gae.controller.actions;

//clases para que acceda al modelo


//clases para el manejo de servlet
import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import com.ms.gae.model.entity.Departamento;
import com.ms.gae.model.jdo.JDO;


public class AgregarDepartamento extends Action implements Serializable{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void run()throws ServletException, IOException{
		try {
			Departamento departamento=new Departamento();
			departamento.setNombre(request.getParameter("nombre"));
			departamento.setDescripcion(request.getParameter("descripcion"));
			jdo= JDO.getInstance(Departamento.class);
			jdo.insert(departamento);
		}catch (Exception ex) {
			throw new ServletException(ex.getMessage());
		}
		RequestDispatcher rd=application.getRequestDispatcher("/index.jsp?pagina=gd");
		if(rd==null){
			throw new ServletException("pagina no encontrada");
		}
		rd.forward(request,response);
	}
	
} 