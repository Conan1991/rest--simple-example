package com.doronin.springrestapiexample.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ProdPK implements Serializable {
    private String name;
    private String sn;
    private String model;

    @Column(name = "name_")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "sn")
    @Id
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Column(name = "model")
    @Id
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdPK prodPK = (ProdPK) o;

        if (name != null ? !name.equals(prodPK.name) : prodPK.name != null) return false;
        if (sn != null ? !sn.equals(prodPK.sn) : prodPK.sn != null) return false;
        if (model != null ? !model.equals(prodPK.model) : prodPK.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sn != null ? sn.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
}
