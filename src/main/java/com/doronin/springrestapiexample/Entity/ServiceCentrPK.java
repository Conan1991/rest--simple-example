package com.doronin.springrestapiexample.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ServiceCentrPK implements Serializable {
    private int number;
    private String name;

    @Column(name = "number_")
    @Id
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Column(name = "name_")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceCentrPK that = (ServiceCentrPK) o;

        if (number != that.number) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
