package com.ifbaiano.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.sql.Date;
import org.junit.jupiter.api.Test;

public class PrintsTest {

    @Test
    public void testConstructorWithParameters() {
        Date date = new Date(System.currentTimeMillis());
        Prints prints = new Prints(1, 101, 50, date);

        assertEquals(1, prints.getPersonId());
        assertEquals(101, prints.getPrintsId());
        assertEquals(50, prints.getPrintedQuantity());
        assertEquals(date, prints.getDate());
    }

    @Test
    public void testGettersAndSetters() {
        Prints prints = new Prints();

        prints.setPersonId(2);
        prints.setPrintsId(201);
        prints.setPrintedQuantity(30);
        Date date = new Date(System.currentTimeMillis());
        prints.setDate(date);

        assertEquals(2, prints.getPersonId());
        assertEquals(201, prints.getPrintsId());
        assertEquals(30, prints.getPrintedQuantity());
        assertEquals(date, prints.getDate());
    }

    @Test
    public void testToString() {
        Prints prints = new Prints(3, 301, 20, new Date(System.currentTimeMillis()));

        String expectedToString = "Prints [personId=3, printsId=301, printedQuantity=20, date=" + prints.getDate() + "]";
        assertEquals(expectedToString, prints.toString());
    }
}
