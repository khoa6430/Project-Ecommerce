/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Item;
import entity.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.servlet.ServletException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Khoa
 */
@WebServlet(name = "SendMailControl", urlPatterns = {"/SendMailControl"})
public class SendMailControl extends HttpServlet {

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
        String email = request.getParameter("email");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String address = request.getParameter("address");
        String phonenumber = request.getParameter("phonenumber");
        String country = request.getParameter("country");
        String province = request.getParameter("province");
        String zip = request.getParameter("zip");
        String shippingorder = request.getParameter("shippingorder");

        HttpSession session1 = request.getSession();
        Order order = (Order) session1.getAttribute("order");
        List<Item> listItems = order.getItems();
        String listsp ="";
        for(Item o : listItems) {
            listsp = listsp + "\nProduct Name : " + o.getProduct().getName()+ " || Quantity : " + o.getIquanity()
                    + " || TotalPrice : " + o.getTotalprice();
        }
        String tongtiendonhang = "\n========================================================" 
                                + "\nTotal Order : " + order.getTotalorder();
        String ndorder = "\t\n"+ "\t\t\t\t\t\tTHIS IS YOUR INFORMATION ORDER" 
                        + "\nFirstName : " +firstname + "\nLastName : " + lastname + "\nEmail : " + email
                        + "\nAddress : " + address +"\nPhoneNumber : " + phonenumber + "\nCountry : " + country
                        + "\nProvince : " + province + "\nZip : " + zip + "\nShipping Order : " +shippingorder
                        + "\n\t\t\t\t\t\tLIST PRODUCT"+listsp + tongtiendonhang;
        final String username = "khoa6430@gmail.com";//your email id
        final String password = "dangkhoa";// your password
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

              try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));//gui email cho khach hang
            message.setSubject("Thanks you for your order!");
            message.setText(ndorder);
            Transport.send(message);
            
            Message message2 = new MimeMessage(session);
            message2.setFrom(new InternetAddress(username));
            message2.setRecipients(Message.RecipientType.TO, InternetAddress.parse(username));
            message2.setSubject("A new order has been created");
            message2.setText(ndorder);
            Transport.send(message2);

        } catch (Exception e) {

        }

        request.setAttribute("firstname", firstname);
        request.setAttribute("lastname", lastname);
        request.setAttribute("email", email);
        request.setAttribute("address", address);
        request.setAttribute("phonenumber", phonenumber);
        request.setAttribute("country", country);
        request.setAttribute("province", province);
        request.getRequestDispatcher("thank.jsp").forward(request, response);   
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
