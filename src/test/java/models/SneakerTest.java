package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {

    @Test
    void getIdTest() {
        // G
        int expected = 3289;

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);
        testSneaker.getId();

        // T
        Assertions.assertEquals(expected, testSneaker.getId());
    }


    @Test
    void getQtyTest() {
        // G
        int expected = 2;

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);
        testSneaker.getQty();

        // T
        Assertions.assertEquals(expected, testSneaker.getQty());
    }


    @Test
    void getNameTest() {
        // G
        String expected = "DrewHouse";

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);
        testSneaker.getName();

        // T
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    void getBrandTest() {
        // G
        String expected = "Crocs";

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);
        testSneaker.getBrand();

        // T
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }


    @Test
    void getSportTest() {
        // G
        String expected = "Leisure";

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);
        testSneaker.getSport();

        // T
        Assertions.assertEquals(expected, testSneaker.getSport());
    }


    @Test
    void getColorTest() {
        // G
        String expected = "Yellow";

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setColor(expected);
        testSneaker.getColor();

        // T
        Assertions.assertEquals(expected, testSneaker.getColor());
    }

    @Test
    void getSizeTest() {
        // G
        float expected = 9.50f;

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);
        testSneaker.getSize();

        // T
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    void getPriceTest() {
        // G
        float expected = 70f;

        // W
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);
        testSneaker.getPrice();

        // T
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

}