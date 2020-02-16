package com.doronin.springrestapiexample.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(ProdPK.class)
public class Prod {
    private String name;
    private String sn;
    private String model;
    private Date dateOfManufacture;
    private String manufacturerCountry;

    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Id
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Basic
    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prod prod = (Prod) o;

        if (name != null ? !name.equals(prod.name) : prod.name != null) return false;
        if (sn != null ? !sn.equals(prod.sn) : prod.sn != null) return false;
        if (model != null ? !model.equals(prod.model) : prod.model != null) return false;
        if (dateOfManufacture != null ? !dateOfManufacture.equals(prod.dateOfManufacture) : prod.dateOfManufacture != null)
            return false;
        if (manufacturerCountry != null ? !manufacturerCountry.equals(prod.manufacturerCountry) : prod.manufacturerCountry != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sn != null ? sn.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (dateOfManufacture != null ? dateOfManufacture.hashCode() : 0);
        result = 31 * result + (manufacturerCountry != null ? manufacturerCountry.hashCode() : 0);
        return result;
    }
}
