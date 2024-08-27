package com.project.thihetmon;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "OrderCollection")
public class Order {
    @Id
    private String id;
    private int orderid;
    private List<Product> products;  // List of products in the order
    private double totalAmount;
    private String deliveryAddress;

    // Constructors
    public Order() {
    }

    public Order(int orderid, List<Product> products, double totalAmount, String deliveryAddress) {
        this.orderid = orderid;
        this.products = products;
        this.totalAmount = totalAmount;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    // Method to calculate the total amount for this order
    public void calculateTotalAmount() {
        this.totalAmount = this.products.stream()
                .mapToDouble(Product::calculateTotalPrice)
                .sum();
    }
}
