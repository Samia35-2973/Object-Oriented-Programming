/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

/**
 *
 * @author HP
 */
public class PacketProduct extends Products{
    private String expiryDate;
    public PacketProduct(String productName, int productPrice, String expiryDate){
        super(productName, productPrice);
        this.expiryDate = expiryDate;
    }
    public PacketProduct(String productName, float productPrice, String expiryDate){
        super(productName, productPrice);
        this.expiryDate = expiryDate;
    }
    @Override
    public void showProductInfo() {
        System.out.println("Expired Date: " + expiryDate);
    }
    
}
