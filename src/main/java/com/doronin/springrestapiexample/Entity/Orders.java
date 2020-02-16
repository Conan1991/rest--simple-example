package com.doronin.springrestapiexample.Entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@IdClass(OrdersPK.class)
public class Orders {
    private int number;
    private Date dateOfReceipt;
    private Date dateOfExec;
    private BigInteger varranty;
    private String typeRepair;
    private Integer price;
    private String fio;
    private String phone;
    private String nameProd;
    private String snProd;
    private int numberSc;
    private String nameSc;

    @Id
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    @Basic
    public Date getDateOfExec() {
        return dateOfExec;
    }

    public void setDateOfExec(Date dateOfExec) {
        this.dateOfExec = dateOfExec;
    }

    @Basic
    public BigInteger getVarranty() {
        return varranty;
    }

    public void setVarranty(BigInteger varranty) {
        this.varranty = varranty;
    }

    @Basic
    public String getTypeRepair() {
        return typeRepair;
    }

    public void setTypeRepair(String typeRepair) {
        this.typeRepair = typeRepair;
    }

    @Basic
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Id
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Id
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    @Basic
    public String getSnProd() {
        return snProd;
    }

    public void setSnProd(String snProd) {
        this.snProd = snProd;
    }

    @Id
    public int getNumberSc() {
        return numberSc;
    }

    public void setNumberSc(int numberSc) {
        this.numberSc = numberSc;
    }

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

        Orders orders = (Orders) o;

        if (number != orders.number) return false;
        if (numberSc != orders.numberSc) return false;
        if (dateOfReceipt != null ? !dateOfReceipt.equals(orders.dateOfReceipt) : orders.dateOfReceipt != null)
            return false;
        if (dateOfExec != null ? !dateOfExec.equals(orders.dateOfExec) : orders.dateOfExec != null) return false;
        if (varranty != null ? !varranty.equals(orders.varranty) : orders.varranty != null) return false;
        if (typeRepair != null ? !typeRepair.equals(orders.typeRepair) : orders.typeRepair != null) return false;
        if (price != null ? !price.equals(orders.price) : orders.price != null) return false;
        if (fio != null ? !fio.equals(orders.fio) : orders.fio != null) return false;
        if (phone != null ? !phone.equals(orders.phone) : orders.phone != null) return false;
        if (nameProd != null ? !nameProd.equals(orders.nameProd) : orders.nameProd != null) return false;
        if (snProd != null ? !snProd.equals(orders.snProd) : orders.snProd != null) return false;
        if (nameSc != null ? !nameSc.equals(orders.nameSc) : orders.nameSc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (dateOfReceipt != null ? dateOfReceipt.hashCode() : 0);
        result = 31 * result + (dateOfExec != null ? dateOfExec.hashCode() : 0);
        result = 31 * result + (varranty != null ? varranty.hashCode() : 0);
        result = 31 * result + (typeRepair != null ? typeRepair.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (nameProd != null ? nameProd.hashCode() : 0);
        result = 31 * result + (snProd != null ? snProd.hashCode() : 0);
        result = 31 * result + numberSc;
        result = 31 * result + (nameSc != null ? nameSc.hashCode() : 0);
        return result;
    }
}
