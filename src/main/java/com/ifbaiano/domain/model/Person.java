package com.ifbaiano.domain.model;

import jakarta.persistence.Entity;

@Entity
public class Person {
    
    private int personId;
    private String name;
    private String cpf;
    private String registration;
    private PersonPrints prints;

    public Person(){

    }

    public Person(int personId, String name, String cpf, String registration, PersonPrints prints) {
        this.personId = personId;
        this.name = name;
        this.cpf = cpf;
        this.registration = registration;
        this.prints = prints;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public PersonPrints getPrints() {
        return prints;
    }

    public void setPrints(PersonPrints prints) {
        this.prints = prints;
    }

    @Override
    public String toString() {
        return "Person [personId=" + personId + ", name=" + name + ", cpf=" + cpf + ", registration=" + registration
                + ", prints=" + prints + "]";
    }
}
