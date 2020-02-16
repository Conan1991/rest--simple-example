package com.doronin.springrestapiexample.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(UserOfCentrPK.class)
public class UserOfCentr {
    private String fio;
    private String phone;
    private Date dateOfBirthsday;

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
    public Date getDateOfBirthsday() {
        return dateOfBirthsday;
    }

    public void setDateOfBirthsday(Date dateOfBirthsday) {
        this.dateOfBirthsday = dateOfBirthsday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserOfCentr that = (UserOfCentr) o;

        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (dateOfBirthsday != null ? !dateOfBirthsday.equals(that.dateOfBirthsday) : that.dateOfBirthsday != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fio != null ? fio.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (dateOfBirthsday != null ? dateOfBirthsday.hashCode() : 0);
        return result;
    }
}
