/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Khoa
 */
@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignUpControl extends HttpServlet {

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
        String user = request.getParameter("newuser");
        String pass = request.getParameter("newpass");
        String re_pass = request.getParameter("repeatpass");
        DAO dao = new DAO();
        Account a = dao.checkAccountExist(user);
        int checkpass;
        if(!pass.equals(re_pass)){
            //day ve trang login
            checkpass=0;
        }
        else{
            checkpass=1;
        }
        if(checkpass==0){
            request.setAttribute("tb", "<div class=\"alert alert-danger\">\n"
                    +"<strong><p class=\"text-danger\">The password does not match!!!\n" +"</p></strong></div>");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else{
            if(a==null){
                //dc signup
                request.setAttribute("tb2", " <div class=\"alert alert-success\">" 
                        +"<strong><p class=\"text-success\">Congratulation,your account has bean successfully created</p></strong></div>\n");
                request.setAttribute("tb2c", "<center><a href=\"home\" class=\"btn btn-info\" role=\"button\">CONTINUE</a></center>");
                dao.signup(user, pass);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            else{
                request.setAttribute("tb3", "<div class=\"alert alert-danger\">\n"
                    +"<strong><p class=\"text-danger\">User Name already exists.Please try with another one\n" +"</p></strong></div>");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
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
