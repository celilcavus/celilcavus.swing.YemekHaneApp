/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celilcavus.yemekHaneApp.Models;

/**
 *
 * @author Celil
 */
public class Product {
    private int id;
    private String ProductName;
    private float Price;

    public void setId(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }
    
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

}
