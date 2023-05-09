/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_thb3;

/**
 *
 * @author ngopt
 */
public class OrderDetail {
    private final Product product;
    private final int quatity;
    
    public OrderDetail(Product product, int quatity){
        this.product = product;
        this.quatity = quatity;
        
    }
    public double getTotal(){
        return product.getProducID()* quatity;
        
    }


}