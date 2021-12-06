/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

import java.util.List;

/**
 *
 * @author Khoa
 */
public class Order implements Serializable{
    private int oid;
    private Account customer;
    private List<Item> items;
    private int status;
    private double totalorder;
    
    
    public Order(){
        this.status=0;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Account getCustomer() {
        return customer;
    }

    public void setCustomer(Account customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getTotalorder() {
        return totalorder;
    }

    public void setTotalorder(double totalorder) {
        this.totalorder = totalorder;
    }


    
    
    
}
