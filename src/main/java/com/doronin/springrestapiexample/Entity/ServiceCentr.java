package com.doronin.springrestapiexample.Entity;

import javax.persistence.*;

@Entity
@IdClass(ServiceCentrPK.class)
public class ServiceCentr {
    private int number;
    private String adress;
    private String name;

    @Id
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

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

        ServiceCentr that = (ServiceCentr) o;

        if (number != that.number) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
