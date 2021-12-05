/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Item;
import entity.Order;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "AddtoCartControl", urlPatterns = {"/addtocart"})
public class AddtoCartControl extends HttpServlet {

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
        int quantity = 1;
        int id;
        DAO dao = new DAO();
        int b3 = 999;
        double b4 =0;
        if(request.getParameter("pid")!=null){
            id = Integer.parseInt(request.getParameter("pid"));
            Product p = dao.getInforProduct(id);
            if(p!=null){ // kt san pham co o database khong
                b3=1522;
                if(request.getParameter("quantity")!=null){//lay sl sp ta vua add to cart
                    quantity = Integer.parseInt(request.getParameter("quantity"));
                }
                HttpSession session = request.getSession();
                if(session.getAttribute("order")==null){//neu chua them sp nao cart
                    Order order = new Order();
                    List<Item> listItems = new ArrayList<Item>();
                    Item item = new Item();
                    if(listItems.size()==0){
                        item.setIid(0);
                    }
                    else{item.setIid(listItems.size());
                    }
                    item.setIquanity(quantity);
                    item.setProduct(p);
                    item.setIprice(p.getPrice());
                    item.setTotalprice(p.getPrice(), quantity);
                    listItems.add(item);
                    order.setItems(listItems);
                    b3=155;
                    session.setAttribute("order", order);                   
                }else{
                    Order order = (Order) session.getAttribute("order");
                    List<Item> listItems = order.getItems();
                    boolean check = false;
                    for(Item item: listItems){ //neu sp co roi thi tang sl 
                        if(item.getProduct().getId() == p.getId()){
                            item.setIquanity(item.getIquanity()+quantity);
                            check=true;
                        }
                    }
                    if(check==false){
                        Item item = new Item();
                        if(listItems.size()==0){
                            item.setIid(0);
                        }else{
                            item.setIid(listItems.size());}
                        item.setIquanity(quantity);
                        item.setProduct(p);
                        item.setIprice(p.getPrice());
                        listItems.add(item);
                    }
                    session.setAttribute("order", order);
                }                             
            }
            //response.sendRedirect("home");
        }
        else{
            //response.sendRedirect("home");            
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
