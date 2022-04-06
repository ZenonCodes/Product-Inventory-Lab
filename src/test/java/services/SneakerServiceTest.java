package services;

import models.Sneaker;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerServiceTest {
    SneakerService sneakerService = new SneakerService();
    String expectedName = "RandomShoe";
    String expectedBrand = "Adidas";
    String expectedSport = "Tennis";
    float expectedSize = 10.5f;
    int expectedQty = 10;
    float expectedPrice = 80.00f;
    Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice, expectedSize);




    @Test
    public void findSneakerTest() {
        sneakerService.setNextId(1);
        int idToFind = 1;
        System.out.println(sneakerService.getInventory());
        assertEquals(sneakerService.findSneaker(idToFind), testSneaker);

    }
    @Test
    public void findSneakerWhenNotPresentTest() {
        sneakerService.setNextId(1);
        int idToFind = 2;
        System.out.println(sneakerService.getInventory());
        Boolean expected = null;
        assertEquals(sneakerService.findSneaker(idToFind),expected);

    }

    @Test
    public void createTest(){
        sneakerService.setNextId(1);
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
    public void findAll() {
        sneakerService.setNextId(1);
        assertTrue(sneakerService.findAll().containsValue(testSneaker));
    }

    @Test
    public void deleteTestWhenIdIsPresent() {
        sneakerService.setNextId(1);
        int idToRemove = 1;
        boolean expected = (sneakerService.delete(idToRemove));
        sneakerService.delete(idToRemove);
        System.out.println(sneakerService.getInventory());
        assertTrue(expected);
    }

    @Test
    public void deleteTestWhenIdIsNotPresent() {
        sneakerService.setNextId(1);
        int idToRemove = 20;
        boolean expected = (sneakerService.delete(idToRemove));

        System.out.println(sneakerService.getInventory());
        assertFalse(expected);
    }

}