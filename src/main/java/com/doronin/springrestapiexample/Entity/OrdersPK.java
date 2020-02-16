package com.doronin.springrestapiexample.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrdersPK implements Serializable {
    private int number;
    private String fio;
    private String phone;
    private int numberSc;
    private String nameSc;

    @Column(name = "number_")
    @Id
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Column(name = "fio")
    @Id
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Column(name = "phone")
    @Id
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "number_sc")
    @Id
    public int getNumberSc() {
        return numberSc;
    }

    public void setNumberSc(int numberSc) {
        this.numberSc = numberSc;
    }

    @Column(name = "name_sc")
    @Id
    public String getNameSc() {
        return nameSc;
    }

    public void setNameSc(String nameSc) {
        this.nameSc = nameSc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersPK ordersPK = (OrdersPK) o;

        if (number != ordersPK.number) return false;
        if (numberSc != ordersPK.numberSc) return false;
        if (fio != null ? !fio.equals(ordersPK.fio) : ordersPK.fio != null) return false;
        if (phone != null ? !phone.equals(ordersPK.phone) : ordersPK.phone != null) return false;
        if (nameSc != null ? !nameSc.equals(ordersPK.nameSc) : ordersPK.nameSc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + numberSc;
        result = 31 * result + (nameSc != null ? nameSc.hashCode() : 0);
        return result;
    }
}
