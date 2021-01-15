/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cemsys.controle;

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
@WebServlet(name = "CadastrarQuadra", urlPatterns = {"/CadastrarQuadra"})
public class CadastrarQuadra extends HttpServlet {

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
                    String id = request.getParameter("id");
                    String descricao = request.getParameter("descricao");


                    Quadra quadra = new Quadra();
                    quadra.setDescricao(descricao);

                    GenericDAO quadraDAO = new QuadraDAO();

                    String mensagem = "";

                    if(id.equals("")){

                    if(quadraDAO.cadastrar(quadra)){
                        mensagem = "Quadra cadastrado com sucesso!";
                    }else{
                        mensagem = "Erro ao cadastrar Quadra!";
                    }
                    }else{
                        quadra.setId(Integer.parseInt(id));
                        if(quadraDAO.alterar(quadra)){
                        mensagem = "Setor alterado com sucesso!";
                        }else{
                        mensagem = "Erro ao alterar Quadra!";
                        }
                    }

                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("cadastrar-quadra.jsp").forward(request, response);

                }catch (Exception e){
                    System.out.println("Erro ao cadastrar quadraCTR "
                            + e.getMessage());
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

