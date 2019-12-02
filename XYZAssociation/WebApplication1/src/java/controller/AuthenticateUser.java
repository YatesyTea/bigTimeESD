/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import model.AuthenticatorBean;
import model.User;

/**
 *
 * @author j3-lui
 */
public class AuthenticateUser extends HttpServlet {

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
        
        /*
         * Takes inputs from index.html
         * Initialises new DBBean
         * Takes parameters
         * Passes dbbean query with parameters
         */
        response.setContentType("text/html");
        AuthenticatorBean auth = new AuthenticatorBean();
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        String s = auth.login(name, pass);
        
        /*
         * Added section for Sprint 2
        
        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(30*60);
        
        response.addCookie(cookie);
        */
        User user = new User(name, pass, s);
        HttpSession session = request.getSession();
        session.setAttribute("status", user);
        
        System.out.println(user.getStatus() + s);
        
        request.setAttribute("verify", s);
        RequestDispatcher view;
        
        if(user.getStatus().equals("ADMIN")){
            view = request.getRequestDispatcher("adminView.jsp");
        }
        
        else if(user.getStatus().equals("APPROVED")){
            view = request.getRequestDispatcher("loginView.jsp");
        }
        
        else if(user.getStatus().equals("PENDING")){
            view = request.getRequestDispatcher("userView.jsp");
        }
        
        else {
            view = request.getRequestDispatcher("noLoginView.jsp"); 
        }
        
        view.forward(request, response);
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
