package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    protected int id;
    protected static int nextId = 1;
    protected String value;



    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return (id == jobField.id) && (Objects.equals(value, jobField.value));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
