/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import model.DBAuthenticatorBean;
import model.DBMemberRETURN;
import model.Member;
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
        response.setContentType("text/html");
        DBAuthenticatorBean auth = new DBAuthenticatorBean();
        DBMemberRETURN dbmb = new DBMemberRETURN();

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        String s = auth.login(name, pass).getStatus();

        User user = new User(name, pass, s);

        HttpSession session = request.getSession();
        session.setAttribute("status", user);

        request.setAttribute("verify", s);

        RequestDispatcher view;

        if (user.getStatus().equals("ADMIN")) {
            view = request.getRequestDispatcher("adminView.jsp");
        } else if (user.getStatus().equals("APPROVED")) {
            Member member = new Member();
            member = dbmb.getMember(name).get(0);
            double balance = member.getBalance();
            session.setAttribute("member", member);
            request.setAttribute("balance", balance);
            view = request.getRequestDispatcher("loginView.jsp");
        } else if (user.getStatus().equals("PENDING")) {
            Member member = new Member();
            member = dbmb.getMember(name).get(0);
            double balance = member.getBalance();
            session.setAttribute("member", member);
            request.setAttribute("balance", balance);
            view = request.getRequestDispatcher("userView.jsp");
        } else {
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
