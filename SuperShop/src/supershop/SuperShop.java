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
public class SuperShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing Objects
        Customer samia = new Customer("Samia Haque", "CO101", "01929829821");
        Products peyaj, alu, chips, biscuit;
        peyaj = new RawProducts("Indian Peyaj", 80, true);
        alu = new RawProducts("Puran Alu", 65.50F,false);
        chips = new PacketProduct("Bombay Sweets Chips", 10, "20-04-2022");
        biscuit = new PacketProduct("Energy Plus Biscuit", 15.50F, "06-04-2022");
        ArrayList<Products> productList = new ArrayList<Products>();
        productList.add(peyaj); productList.add(alu); productList.add(biscuit); productList.add(chips);
        OrderInfo order = new OrderInfo("O101", "10:56PM", "06-04-22", productList);
        
        
        //Display Information
        samia.showCustomerInfo();
        order.showOrderInfo();
    }
    
}
