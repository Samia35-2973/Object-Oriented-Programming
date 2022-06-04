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
public class Customer {
    private String customerName, customerID, customerPhone;
    public Customer(String customerName, String customerID, String customerPhone){
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerPhone = customerPhone;
    }
    public void showCustomerInfo(){
        System.out.println("Customer Information\nName: "+customerName+'\n'+"ID: "+customerID + '\n'+"Phone: " + customerPhone);
    }
}
