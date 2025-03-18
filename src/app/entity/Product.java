package app.entity;

import app.utils.Constants;

public record Product(String name, int quantity, double price) {
    @Override
    public String toString() {
        return "Product name: " + name + ", quantity: " + quantity + Constants.PIECES +  ", price: "
                + Constants.CURRENCY + " " +  price + " per one " + Constants.PIECES + ";";
    }
}
