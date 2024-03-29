package Entities;

public class Product implements IEntity {
    public Product(int id, String name, int unitsInStock, double price) {
        this.id = id;
        this.name = name;
        this.unitsInStock = unitsInStock;
        this.price = price;
    }

    private int id;
    private String name;
    private int unitsInStock;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
