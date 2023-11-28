package com.ifbaiano.domain.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class PersonPrints {
    
    private int personPrintsId;
    private int printedQuantity;
    private int availableQuantity;
    private int printLimit;
    private int personId;
    private List<Prints> printsList;

    public PersonPrints(){

    }
    
    public PersonPrints(int personPrintsId, int printedQuantity, int availableQuantity,
            int printLimit, int personId, List<Prints> printsList) {
        this.personPrintsId = personPrintsId;
        this.printedQuantity = printedQuantity;
        this.availableQuantity = availableQuantity;
        this.printLimit = printLimit;
        this.personId = personId;
        this.printsList = printsList;
    }

    public int getPersonPrintsId() {
        return personPrintsId;
    }

    public void setPersonPrintsId(int personPrintsId) {
        this.personPrintsId = personPrintsId;
    }

    public int getPrintedQuantity() {
        return printedQuantity;
    }

    public void setPrintedQuantity(int printedQuantity) {
        this.printedQuantity = printedQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getPrintLimit() {
        return printLimit;
    }

    public void setPrintLimit(int printLimit) {
        this.printLimit = printLimit;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public List<Prints> getPrintsList() {
        return printsList;
    }

    public void setPrintsList(List<Prints> printsList) {
        this.printsList = printsList;
    }

    @Override
    public String toString() {
        return "PersonPrints [personPrintsId=" + personPrintsId + ", printedQuantity=" + printedQuantity 
                + ", availableQuantity=" + availableQuantity + ", printLimit=" + printLimit
                + ", personId=" + personId + ", printsList=" + printsList + "]";
    }
}