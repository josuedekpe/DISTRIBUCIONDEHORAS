/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Usuario;
import Conexion.conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC-04
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        try
        {
            Conexion.conexion conex = new conexion();
            Clases.Usuario user = new Usuario(conex.conexion);

        String usuario = request.getParameter("user");
        String clave = request.getParameter("password");
        String id="",nombres="",dni="",grado="",seccion="";
        al.setDNI(usuario);

        ResultSet lista = al.Listar(usuario);

        try {
            int k = 0;
            while (lista.next()) {
                k++;
                id=lista.getString("IdAlumno");
                nombres=lista.getString("Apellidos_Nombres");
                dni=lista.getString("DNI");
                grado=lista.getString("Grado");
                seccion=lista.getString("Seccion");
              
            }
            
        } catch (Exception ex) {
            out.print(ex);
        } finally {
            conex.Cerrar_Conexion();
        }

        if (usuario.equalsIgnoreCase(dni) && clave.equals(dni)) {
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("nombre", nombres);
            response.sendRedirect("votacion.jsp");
        } else {
            response.sendRedirect("index.html");
        }
        
        
         } finally {
            out.close();
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
