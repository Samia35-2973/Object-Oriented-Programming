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
public abstract class Products {
    private String productName;
    private float productPrice;
    public Products(String productName, float productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public abstract void showProductInfo();
    public void to_string(){
        System.out.println("Product Name: " + productName + "\nProduct Price: " + productPrice);
    }
    public float getproductPrice(){
        return productPrice;
    }
}
