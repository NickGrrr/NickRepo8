package web.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {


    private String model;
    private int gen;

    public Car(String model, int gen, String ownerName) {
        this.model = model;
        this.gen = gen;
        this.ownerName = ownerName;
    }

    private String ownerName;
    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", gen=" + gen +
                ", ownerName='" + ownerName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return gen == car.gen && Objects.equals(model, car.model) && Objects.equals(ownerName, car.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, gen, ownerName);
    }
}
