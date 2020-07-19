package com.example.senka;

public class Product {
    int image;
    String name;
    String des;
    String price;

    public Product(int image, String name, String des, String price) {
        this.image = image;
        this.name = name;
        this.des = des;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
