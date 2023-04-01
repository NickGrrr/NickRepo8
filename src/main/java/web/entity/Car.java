package web.entity;

import java.util.ArrayList;
import java.util.List;

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
}
