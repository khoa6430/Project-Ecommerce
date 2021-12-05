/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Khoa
 */
public class Item implements Serializable{
    private int iid;
    private Product product;
    private int iquanity;
    private BigDecimal iprice;
    private int pcuserid;
    private BigDecimal totalprice;
   
    public Item() {
        super();
    }

    public Item(int iid, Product product, int iquanity, BigDecimal iprice, int pcuserid) {
        this.iid = iid;
        this.product = product;
        this.iquanity = iquanity;
        this.iprice = iprice;
        this.pcuserid = pcuserid;
    }
    public BigDecimal getTotalprice() {
        return iprice.multiply(new BigDecimal(iquanity)); 
    }

    public void setTotalprice(BigDecimal iprice,int iquanity) {
        this.totalprice = iprice.multiply(new BigDecimal(iquanity));
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

    public BigDecimal getIprice() {
        return iprice;
    }

    public void setIprice(BigDecimal iprice) {
        this.iprice = iprice;
    }

    public int getPcuserid() {
        return pcuserid;
    }

    public void setPcuserid(int pcuserid) {
        this.pcuserid = pcuserid;
    }
}
