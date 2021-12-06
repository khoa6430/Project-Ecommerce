/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;


/**
 *
 * @author Khoa
 */
public class Item implements Serializable{
    private int iid;
    private Product product;
    private int iquanity;
    private double iprice;
    private int pcuserid;
    private double totalprice;
   
    public Item() {
        super();
    }

    public Item(int iid, Product product, int iquanity, double iprice, int pcuserid) {
        this.iid = iid;
        this.product = product;
        this.iquanity = iquanity;
        this.iprice = iprice;
        this.pcuserid = pcuserid;
    }
    public double getTotalprice() {
        return iprice*(double)iquanity; 
    }

    public void setTotalprice(double iprice,int iquanity) {
        this.totalprice = iprice*iquanity;
    }
    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getIquanity() {
        return iquanity;
    }

    public void setIquanity(int iquanity) {
        this.iquanity = iquanity;
    }

    public double getIprice() {
        return iprice;
    }

    public void setIprice(double iprice) {
        this.iprice = iprice;
    }

    public int getPcuserid() {
        return pcuserid;
    }

    public void setPcuserid(int pcuserid) {
        this.pcuserid = pcuserid;
    }
}
