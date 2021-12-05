/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Category;
import entity.Categoryfurnitures;
import entity.Categorymen;
import entity.Categorywomen;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Khoa
 */
@WebServlet(name = "HomeControl", urlPatterns = {"/home"})
public class HomeControl extends HttpServlet {

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
        //B1:GET DATA FROM DAO
        DAO dao = new DAO();
        List<Product> list = dao.getProductFeature();
        List<Category> listC = dao.getAllCategory();
        List<Categorymen> listMen = dao.getCategoryMen();
        List<Categorywomen> listWomen = dao.getCategoryWomen();
        List<Categoryfurnitures> listFurnitures = dao.getCategoryFurnitures();  
        List<Product> listTshirt = dao.getProductByCateName("T-SHIRT", 1, 1, 10);
        List<Product> listSkincare = dao.getProductByCateName("",6, 1, 10);
        List<Product> listToys = dao.getProductByCateName("",8, 1, 10);
        List<Product> listElec = dao.getProductByCateName("",5, 1, 10);
        List<Product> listTables = dao.getProductByCateName("TABLES",4, 1, 10);
        List<Product> listSPRecommed = dao.getProductRecommed();
        //B2: SET DATA TO JSP
        request.setAttribute("listP", list);
        request.setAttribute("listC", listC);
        request.setAttribute("listMen", listMen);
        request.setAttribute("listWomen", listWomen);
        request.setAttribute("listFurnitures", listFurnitures);
        //list product tab
        request.setAttribute("listSkincare", listSkincare);
        request.setAttribute("listTshirt", listTshirt);
        request.setAttribute("listToys", listToys);
        request.setAttribute("listElec", listElec);
        request.setAttribute("listTables", listTables);
        request.setAttribute("listSPRecommed", listSPRecommed);
        request.getRequestDispatcher("home.jsp").forward(request, response);
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
