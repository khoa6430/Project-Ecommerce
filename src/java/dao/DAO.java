/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Category;
import entity.Categoryfurnitures;
import entity.Categorymen;
import entity.Categorywomen;
import entity.Product;
import entity.Item;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.context.internal.ManagedSessionContext;
import util.NewHibernateUtil;

/**
 *
 * @author Khoa
 */
public class DAO {
//    Connection conn = null; // kết nối với sql
//    PreparedStatement ps = null; // thực thi câu lệnh bên sql
//    ResultSet rs = null; // lấy kết quả trả về
 
    public static List<Product> getProductFeature(){
        List<Product> list = null;
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        String sql = " from Product where id = 170 or id = 103 or id = 245 "
                + "or id = 14 or id = 118 or id = 85 or id = 28 or id = 217 or id = 260";
        Query q = s.createQuery(sql);
        list = q.list();
        if(s.isOpen()){ //myself
            s.close();  
        }
        return list;
    }
    public static List<Product> getProductRecommed(){
        List<Product> list = null;
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        String sql = " from Product where id = 70 or id = 219 or id = 27 or id = 55 or id = 217 or id = 5";
        Query q = s.createQuery(sql);
        list = q.list();
        if(s.isOpen()){ //myself
            s.close();  
        }
        return list;
    }
    public static List<Category> getAllCategory(){
        List<Category> list = null;
        final Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();

            s.beginTransaction();
            try{
                String sql = " from Category";
                Query q = s.createQuery(sql);
                list = q.list();
                if(s.isOpen()){ //myself
                    s.close();  
                }
                }catch (Exception e){
                    // Log the exception here
                     s.getTransaction().rollback();
                     throw e;
                }
        return list;
    }
    public static List<Categorymen> getCategoryMen(){
        List<Categorymen> list = null;
        final Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            try{
                String sql = " from Categorymen";
                Query q = s.createQuery(sql);
                list = q.list();
                //s.getTransaction().commit();
                if(s.isOpen()){ //myself
                    s.close();  
                }
                }catch (Exception e){
                    // Log the exception here
                       s.getTransaction().rollback();
                    throw e;
                }
        return list;
    }
   public static List<Categorywomen> getCategoryWomen(){
        List<Categorywomen> list = null;
        final Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            try{
                String sql = " from Categorywomen";
                Query q = s.createQuery(sql);
                list = q.list();
                if(s.isOpen()){ //myself
                    s.close();  
                 }
                }catch (Exception e){
                    // Log the exception here
                       s.getTransaction().rollback();
                    throw e;
                }
        return list;
    }
    public static List<Categoryfurnitures> getCategoryFurnitures(){
        List<Categoryfurnitures> list = null;
        final Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            try{
                String sql = " from Categoryfurnitures";
                Query q = s.createQuery(sql);
                list = q.list();
                //s.getTransaction().commit();
                if(s.isOpen()){ //myself
                    s.close();  
                }
            }catch (Exception e){
                // Log the exception here
                   s.getTransaction().rollback();
                throw e;
            }

        return list;
    }
     public static List<Product> searchByName(String textSearch){
        List<Product> list = null;
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        String sql = " from Product Where name like '%" + textSearch +"%'";
        Query q = s.createQuery(sql);
        list = q.list();
        if(s.isOpen()){ //myself
            s.close();
        }
        return list;
    }
    public static Account loginAccount(String user,String pass){
        List<Account> list = null;
        Account a = new Account();
        try{
            Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            String sql = " from Account Where user='"+user+"' and pass ='" + pass + "'";
            Query q = s.createQuery(sql);
            list = q.list();
            a = list.get(0);
            if(s.isOpen()){ //myself
                s.close();
            }
            if(list!=null){
                return a;
            }
        }catch(Exception e ){}
         return null;
    }         
    public static Account checkAccountExist(String user){
        List<Account> list = null;
        Account a = new Account();
        try{
            Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            String sql = " from Account Where user='" + user +"'";
            Query q = s.createQuery(sql);
            list = q.list();
            a = list.get(0);
            if(s.isOpen()){ //myself
                s.close();
            }
            if(list!=null){
                return a;
            }
        }catch(Exception e ){}
         return null;
    }
    public static void signup(String user,String pass){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Account p = new Account();
        p.setUser(user);
        p.setPass(pass);
        p.setIsAdmin(1);
        p.setIsSell(1);
        try{
            s.beginTransaction();
            s.save(p);
            s.getTransaction().commit();
            s.close();
        }catch(Exception e ){
            s.getTransaction().rollback();//back lai giao dich
        }
        finally{
            s.close();
        }
    }
    public static Product getInforProduct(int id){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Product p = (Product)s.get(Product.class, id);
        if(s.isOpen()){ //myself
                s.close();
        }
        return p;
    }
    public static int getTotalProductByCategory(String dtname,int cateid){
        final Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        String sql="";
        if(dtname == null || dtname.length() == 0){
            sql = "select count(*) from Product where cateID=" + cateid;
        }
        else if(dtname!=null){ //select cac product co detail category
            sql = "select count(*) from Product where cateDetailName='" + dtname + "'";
        }
        int a=0;
        s.beginTransaction();
        try{
            Query q = s.createQuery(sql);
            a = ((Number) q.uniqueResult()).intValue();
            if(s.isOpen()){ //myself
                s.close();
            }
        }catch (Exception e){
             // Log the exception here
            s.getTransaction().rollback();
            throw e;
        }
        return a;
    }
    public static List<Product> getProductByCateName(String dtname,int cateid,int position, int pageSize){
        List<Product> list = null;
        String sql="";
        System.out.println("TEN DT NAME");
        System.out.println(dtname);
        if(dtname == null || dtname.length() == 0){ 
            sql = "from Product where cateID= " + cateid;
        }
        else if(dtname!=null){ //select cac product co detail category
            sql = "from Product where cateID=" + cateid + " and cateDetailName='"+ dtname + "'";
        }
//        if(position == 1 ){
//            position =0;
//        }
        position = (position-1)*pageSize;
        final Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            try{
                Query q = s.createQuery(sql);
                q.setFirstResult(position);
                q.setMaxResults(pageSize);
                list=q.list();
                if(s.isOpen()){ //myself
                    s.close();  
                }
            }catch (Exception e){
               // Log the exception here
                s.getTransaction().rollback();
                throw e;
            }

        return list;  
    }
   
    //buoc nay kiem tra xem phia tren lay duoc du lieu chua
    public static void main(String[] args){
        DAO dao = new DAO();
        //getProductFeature();
        //getAllCategory();
        //getCategoryMen();
//        if(loginAccount()==null){
//            System.out.println("NULL!!!!!!!!!!");
//        }
//        else{
//            System.out.println("CO");
//        }
//          List<Product> listC2 = getProductByCateName(1,6);
//          for (Product o : listC2) {
//                System.out.println(o.getId());
//        }
          
          List<Product> listC2 = getProductByCateName("T-SHIRT",1,2,6);
          for (Product o : listC2) {
                System.out.println(o.getName() + " ID " + o.getId());
        }

    }
}
