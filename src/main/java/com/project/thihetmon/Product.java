package com.project.thihetmon;

public class Product {
    private String productId;
    private String productName;
    private String size;
    private double price;
    private int quantity;

    // Constructors
    public Product() {
    }

    public Product(String productId, String productName, String size, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total price for this product
    public double calculateTotalPrice() {
        return this.price * this.quantity;
    }
}
