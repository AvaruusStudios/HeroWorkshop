package com.avaruus.db.species;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Avaruus Studios
 * @name SpeciesTableModel.java
 * @date Feb 23, 2020
 */
public class SpeciesTableModel {
    private SimpleStringProperty SpeciesName;
    private SimpleStringProperty SpeciesSize;
    private SimpleIntegerProperty SpeciesSpeed;

    public SpeciesTableModel(String SpeciesName, String SpeciesSize, Integer SpeciesSpeed) {
        this.SpeciesName = new SimpleStringProperty(SpeciesName);
        this.SpeciesSize = new SimpleStringProperty(SpeciesSize);
        this.SpeciesSpeed = new SimpleIntegerProperty(SpeciesSpeed);
    }

    public String getSpeciesName() {
        return SpeciesName.get();
    }

    public void setSpeciesName(String SpeciesName) {
        this.SpeciesName = new SimpleStringProperty(SpeciesName);
    }

    public String getSpeciesSize() {
        return SpeciesSize.get();
    }

    public void setSpeciesSize(String SpeciesSize) {
        this.SpeciesSize = new SimpleStringProperty(SpeciesSize);
    }

    public Integer getSpeciesSpeed() {
        return SpeciesSpeed.get();
    }

    public void setSpeciesSpeed(Integer SpeciesSpeed) {
        this.SpeciesSpeed = new SimpleIntegerProperty(SpeciesSpeed);
    }
}
