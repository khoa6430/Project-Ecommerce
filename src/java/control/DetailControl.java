/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import static dao.DAO.getProductByCateName;
import entity.Account;
import entity.Category;
import entity.Categoryfurnitures;
import entity.Categorymen;
import entity.Categorywomen;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Khoa
 */
@WebServlet(name = "DetailControl", urlPatterns = {"/detail"})
public class DetailControl extends HttpServlet {

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
        String dtname = request.getParameter("dtname");
        int idcate = Integer.parseInt(request.getParameter("idcategory"));
        String indexpage = request.getParameter("index");
        if(indexpage==null){
            indexpage="1";
        }     
        int index = Integer.parseInt(indexpage);        
        DAO dao = new DAO(); 
        //category
        List<Category> listC = dao.getAllCategory();
        List<Categorymen> listMen = dao.getCategoryMen();
        List<Categorywomen> listWomen = dao.getCategoryWomen();
        List<Categoryfurnitures> listFurnitures = dao.getCategoryFurnitures(); 
        
        
        List<Product> listSP2 = dao.getProductByCateName(dtname,idcate,index,6);
        //List<Product> listSP2 = dao.getProductByCateName("CHAIRS",4,1,1);
        //truyen lai dtname va cateid hien tai
        //numberpage
        
        int count = dao.getTotalProductByCategory(dtname, idcate);
        int endPage = count/6;
        if(count%6!=0){
            endPage++;
        }
        
        //numberpage
        request.setAttribute("dtname2", dtname);
        request.setAttribute("idcate2", idcate);
       
        request.setAttribute("endP", endPage);
        //listsp
        request.setAttribute("listSP", listSP2);
        request.setAttribute("listC", listC);
        request.setAttribute("listMen", listMen);
        request.setAttribute("listWomen", listWomen);
        request.setAttribute("listFurnitures", listFurnitures);
        request.setAttribute(("tag"), index); 
        request.getRequestDispatcher("shop.jsp").forward(request, response);
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
