package services;

import models.Sneaker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SneakerService {

    private static int nextId = 1;
    private HashMap<Integer,Sneaker> inventory = new HashMap<>();

    public Sneaker create(String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice, float expectedSize) {
       Sneaker createdSneaker =  new Sneaker(nextId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
       inventory.put(createdSneaker.getId(), createdSneaker);
       return inventory.get(nextId++);

    }

    //read
    public Sneaker findSneaker(int id) {
        if (inventory.containsKey(id)) return inventory.get(id);
        return null;
    }

    //read all
    public HashMap<Integer, Sneaker> findAll() {

        return inventory;
    }

    public boolean delete(int id) {

            if(inventory.containsKey(id)){
                inventory.remove(id);
                nextId--;
                return true;
            }
    return false;
    }

    public HashMap<Integer, Sneaker> getInventory() {
        return this.inventory;
    }
    public static void setNextId(int nextId) {
        SneakerService.nextId = nextId;
    }

}
