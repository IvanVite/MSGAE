package com.ms.gae.controller;
//clases con las cuales trabaja
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.jdo.PersistenceManager;
//clases para que sea servlet
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//posibles excepciones
import javax.servlet.ServletException;

import com.ms.gae.controller.actions.Action;
import com.ms.gae.model.PMF;

import java.io.IOException;

@SuppressWarnings("serial")
public class Controller extends HttpServlet{
	
	final PersistenceManager pm = PMF.get().getPersistenceManager();
	
	public void doGet(HttpServletRequest rq, HttpServletResponse rp)throws IOException, ServletException{
		System.out.println("Controller.doGet()");
		ejecutar(rq, rp);
	}
	
	public void doPost(HttpServletRequest rq, HttpServletResponse rp)throws IOException, ServletException{
		System.out.println("doPost------");
		ejecutar(rq, rp);
	}
	
	private void ejecutar(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		HttpSession session=request.getSession();
		System.out.println("Ejecutar------");
        @SuppressWarnings("unchecked")
		Map<String,Action> mapaAcciones = (Map<String,Action>)session.getAttribute("mapaAcciones");
        if(mapaAcciones==null){
        	System.out.println("IF---mapaAcciones---");
            mapaAcciones=new HashMap<String,Action>();
            System.out.println("IF---Has---");
        }
        ServletContext context=getServletContext();
        try {
            String infoRuta = request.getPathInfo();
            if(infoRuta==null){
            	throw new ServletException("RUTA DESCONOCIDA");
            }
            Action accion= (Action) mapaAcciones.get(infoRuta);
            System.out.println("Acciones-- get--");
            if(accion==null){
            	StringTokenizer st = new StringTokenizer(infoRuta,"/");
                if(st.countTokens()!=2){
                	throw new ServletException("estado interno invalido- no hay informacion de ruta["+infoRuta+"]");
                }
                String evento = st.nextToken();
                String bean = st.nextToken();
                String servlet="com.ms.gae.controller.actions."+ evento + bean;
                try {
                	System.out.println("try------");
                    @SuppressWarnings("rawtypes")
					Class claseAccion = Class.forName(servlet);
                    accion = (Action) claseAccion.newInstance();
//                    Action claseAccion = new Action();
                    System.out.println("Clase Accion------");
                    mapaAcciones.put(infoRuta,accion);
                    session.setAttribute("mapaAcciones",mapaAcciones);
                    System.out.println("mapaAcciones------");
                }catch (ClassNotFoundException ex){
                    throw new ServletException("No se pudo cargar la clase "+servlet+": "+ex.getMessage());
                }catch (InstantiationException ex){
                    throw new ServletException("No se pudo instanciar un objeto de la clase "+servlet+": "+ex.getMessage());
                }catch (IllegalAccessException ex){
                    throw new ServletException(servlet+": "+ex.getMessage());
                }
            }
			if(pm==null){
				throw new ServletException("MODELO DE CONEXION A BD NULO, IMPOSIBLE CONTINUAR CON LA OPERACION");
			}
            accion.setRequest(request);
            accion.setPersistenceManager(PMF.get().getPersistenceManager());
            accion.setResponse(response);
            accion.setApplication(context);
            accion.run();
        } catch (Exception e) {
            throw new ServletException("Error... \n"+e);
        }
	}
	
    public String getServletInfo() {
        return "CONTROLADOR DE ACCIONES Y REDIRECCIONAMIENTO (SIN MI NO HAY COMUNICACION ENTRE LO QUE VES Y LO QUE NO VES);";
    }        
}