package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;
    private static ArrayList <Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice, float expectedSize) {
       Sneaker createdSneaker =  new Sneaker(nextId++, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
       inventory.add(createdSneaker);
       return createdSneaker;
    }
}
