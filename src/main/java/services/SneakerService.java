package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;
    private ArrayList <Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice, float expectedSize) {
        return new Sneaker(nextId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
    }
}
