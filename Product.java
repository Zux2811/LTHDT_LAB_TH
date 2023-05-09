/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_thb3;

/**
 *
 * @author ngopt
 */
public class Product {
    private String descripton;
    private final double productID;
    
    public Product(String description, double productID){
        this.productID = productID;
    }
    public double getProductID(){
        return productID;
    }

    int getProducID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
