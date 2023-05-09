/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_thb3;

/**
 *
 * @author ngopt
 */
public class MainClass {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 20.0);
        Product product3 = new Product("Product 3", 30.0);

        // Tạo đơn hàng
        Order order = new Order();

        // Thêm sản phẩm vào đơn hàng
        order.addLineItem(product1, 2);
        order.addLineItem(product2, 3);
        order.addLineItem(product3, 1);

        // Tính tổng hóa đơn
        double total = order.getTotal();

        // In tổng hóa đơn
        System.out.println("Tổng hóa đơn: " + total);
    }

}
