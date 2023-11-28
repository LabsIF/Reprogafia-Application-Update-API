package com.ifbaiano.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testConstructorWithParameters() {
        PersonPrints prints = new PersonPrints();
        Person person = new Person(1, "João", "123.456.789-00", "M123", prints);

        assertEquals(1, person.getPersonId());
        assertEquals("João", person.getName());
        assertEquals("123.456.789-00", person.getCpf());
        assertEquals("M123", person.getRegistration());
        assertEquals(prints, person.getPrints());
    }

    @Test
    public void testGettersAndSetters() {
        PersonPrints prints = new PersonPrints();
        Person person = new Person();

        person.setPersonId(2);
        person.setName("Maria");
        person.setCpf("987.654.321-00");
        person.setRegistration("M456");
        person.setPrints(prints);

        assertEquals(2, person.getPersonId());
        assertEquals("Maria", person.getName());
        assertEquals("987.654.321-00", person.getCpf());
        assertEquals("M456", person.getRegistration());
        assertEquals(prints, person.getPrints());
    }

    @Test
    public void testToString() {
        PersonPrints prints = new PersonPrints();
        Person person = new Person(3, "Carlos", "111.222.333-44", "M789", prints);

        String expectedToString = "Person [personId=3, name=Carlos, cpf=111.222.333-44, registration=M789, prints=" + prints + "]";
        assertEquals(expectedToString, person.toString());
    }
}
