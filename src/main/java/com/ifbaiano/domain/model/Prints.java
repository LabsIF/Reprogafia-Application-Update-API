package com.ifbaiano.domain.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class Prints {
    
    private int personId;
    private int printsId;
    private int printedQuantity;
    private Date date;

    public Prints(){

    }

    public Prints(int personId, int printsId, int printedQuantity, Date date) {
        this.personId = personId;
        this.printsId = printsId;
        this.printedQuantity = printedQuantity;
        this.date = date;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPrintsId() {
        return printsId;
    }

    public void setPrintsId(int printsId) {
        this.printsId = printsId;
    }

    public int getPrintedQuantity() {
        return printedQuantity;
    }

    public void setPrintedQuantity(int printedQuantity) {
        this.printedQuantity = printedQuantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Prints [personId=" + personId + ", printsId=" + printsId + ", printedQuantity="
                + printedQuantity + ", date=" + date + "]";
    }
}
