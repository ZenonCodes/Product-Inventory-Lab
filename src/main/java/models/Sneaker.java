package models;

public class Sneaker {
    private int id, qty;
    private String name, brand, sport;
    private float size, price;

    public Sneaker(int expectedId, String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice) {
        this.id = expectedId;
        this.name = expectedName;
        this.brand = expectedBrand;
        this.sport = expectedSport;
        this.qty = expectedQty;
        this.price = expectedPrice;
    }
    public Sneaker (){}

    public Sneaker(int id, String name, String brand, String sport, int qty, float price, float size) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.qty = qty;
        this.price = price;
        this.size = size;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
