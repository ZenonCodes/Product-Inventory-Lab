package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SneakerService {
    private static int nextId = 1;
    private static ArrayList <Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice, float expectedSize) {
       Sneaker createdSneaker =  new Sneaker(nextId++, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
       inventory.add(createdSneaker);
       return createdSneaker;

    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return null;
    }

    //read all
    public Sneaker[] findAll() {
        return null;
    }

    public boolean delete(int id) {
        for (Sneaker s: inventory) {
            if (s.getId() == id){
                inventory.remove(s);
                return true;
            }
        }
return false;
    }

    public ArrayList<Sneaker> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Sneaker> inventory) {
        this.inventory = inventory;
    }
}
