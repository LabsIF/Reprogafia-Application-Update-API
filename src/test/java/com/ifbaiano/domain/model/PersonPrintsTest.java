package com.ifbaiano.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PersonPrintsTest {
    
    @Test
    public void testConstructorWithParameters() {
        List<Prints> printsList = new ArrayList<>();
        PersonPrints personPrints = new PersonPrints(1, 50, 30, 100, 101, printsList);

        assertEquals(1, personPrints.getPersonPrintsId());
        assertEquals(50, personPrints.getPrintedQuantity());
        assertEquals(30, personPrints.getAvailableQuantity());
        assertEquals(100, personPrints.getPrintLimit());
        assertEquals(101, personPrints.getPersonId());
        assertEquals(printsList, personPrints.getPrintsList());
    }

    @Test
    public void testGettersAndSetters() {
        PersonPrints personPrints = new PersonPrints();

        personPrints.setPersonPrintsId(2);
        personPrints.setPrintedQuantity(20);
        personPrints.setAvailableQuantity(15);
        personPrints.setPrintLimit(50);
        personPrints.setPersonId(102);
        List<Prints> printsList = new ArrayList<>();
        personPrints.setPrintsList(printsList);

        assertEquals(2, personPrints.getPersonPrintsId());
        assertEquals(20, personPrints.getPrintedQuantity());
        assertEquals(15, personPrints.getAvailableQuantity());
        assertEquals(50, personPrints.getPrintLimit());
        assertEquals(102, personPrints.getPersonId());
        assertEquals(printsList, personPrints.getPrintsList());
    }

    @Test
    public void testToString() {
        PersonPrints personPrints = new PersonPrints(3, 40, 25, 80, 103, new ArrayList<>());

        String expectedToString = "PersonPrints [personPrintsId=3, printedQuantity=40, availableQuantity=25, printLimit=80, personId=103, printsList=[]]";
        assertEquals(expectedToString, personPrints.toString());
    }
}
