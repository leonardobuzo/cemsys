/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cemsys.controle;

import br.com.cemsys.dao.GenericDAO;
import br.com.cemsys.dao.QuadraDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "ExcluirQuadra", urlPatterns = {"/ExcluirQuadra"})
public class ExcluirQuadra extends HttpServlet {

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
        try{
            Integer id = Integer.parseInt(request.getParameter("id"));
            
            GenericDAO dao = new QuadraDAO();
            String mensagem = "";
            
            if(dao.excluir(id)){
                mensagem = "Quadra excluído com sucesso!";
            }else{
                mensagem = "Erro ao excluir quadra!";
            }
            request.setAttribute("msg", mensagem);
            request.getRequestDispatcher("listar-quadra.jsp").forward(request, response);
        }
            
        catch (Exception e){
            System.out.println("Erro ao excluir quadraCTR " + e.getMessage());
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
