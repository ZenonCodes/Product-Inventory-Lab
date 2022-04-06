package services;

import models.Sneaker;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerServiceTest {
    SneakerService sneakerService;
    Sneaker testSneaker,testSneaker2,testSneaker3;
    String expectedName = "Stan Smith";
    String expectedBrand = "Adidas";
    String expectedSport = "Tennis";
    float expectedSize = 10.5f;
    int expectedQty = 10;
    float expectedPrice = 80.00f;

    @Before
    public void init(){
        sneakerService = new SneakerService();
        testSneaker = SneakerService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
    }

    @Test
    public void createTest(){
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        float actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findSneakerTest(int id) {

    }

    @Test
    public void findAll() {
        // should return a basic array copy of the ArrayList
    }

    @Test
    public void deleteTestWhenIdIsPresent() {
        int idToRemove = 2;
//
        sneakerService = new SneakerService();
        testSneaker = SneakerService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
        testSneaker2 = SneakerService.create("B", expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
        testSneaker3 = SneakerService.create("A", expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
        boolean expected = (sneakerService.delete(idToRemove));

        System.out.println(sneakerService.getInventory());
        assertTrue(expected);
    }

    @Test
    public void deleteTestWhenIdIsNotPresent() {
        int idToRemove = 20;
//
        sneakerService = new SneakerService();
        testSneaker = SneakerService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
        testSneaker2 = SneakerService.create("B", expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
        testSneaker3 = SneakerService.create("A", expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);
        boolean expected = (sneakerService.delete(idToRemove));

        System.out.println(sneakerService.getInventory());
        assertFalse(expected);
    }

}