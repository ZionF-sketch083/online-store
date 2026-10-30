package com.pluralsight;

public class Product {
    private String productId;
    private String productName;
    private int price;
    private String department;

    public Product(String productId, String productName, int price, String department) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
