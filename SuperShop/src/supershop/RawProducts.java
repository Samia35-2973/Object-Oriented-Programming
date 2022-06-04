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
public class RawProducts extends Products{
    private boolean isFresh;
    public RawProducts(String productName, int productPrice, boolean isFresh){
        super(productName, productPrice);
        this.isFresh = isFresh;
    }
    public RawProducts(String productName, float productPrice, boolean isFresh){
        super(productName, productPrice);
        this.isFresh = isFresh;
    }
    @Override
    public void showProductInfo() {
        if(isFresh==true) System.out.println("The Product is Fresh");
        else System.out.println("The Product is not Fresh");
    }
}
