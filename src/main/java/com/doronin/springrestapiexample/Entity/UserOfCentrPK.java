package com.doronin.springrestapiexample.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UserOfCentrPK implements Serializable {
    private String fio;
    private String phone;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserOfCentrPK that = (UserOfCentrPK) o;

        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fio != null ? fio.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
