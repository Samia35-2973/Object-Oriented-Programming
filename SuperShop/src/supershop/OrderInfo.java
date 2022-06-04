/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class OrderInfo {
    private String orderNo, orderTime, orderDate;
    private float totalAmount = (float)0;
    private ArrayList<Products> productList = new ArrayList<Products>();
    public OrderInfo(String orderNo, String orderTime, String orderDate, ArrayList<Products> productList){
        this.orderNo = orderNo;
        this.orderTime = orderTime;
        this.orderDate = orderDate;
        this.productList = productList;
    }
    public void showOrderInfo(){
        System.out.println("Order No: " + orderNo + "\norder Time: " + orderTime + "\nOrder Date: " + orderDate);
        System.out.println("Purchased Products:");
        for(Products i:productList){
            totalAmount += i.getproductPrice();
            System.out.println("Product Details");
            i.to_string();
            i.showProductInfo();
        }
        System.out.println("Total Price: " + totalAmount);
    }
}
