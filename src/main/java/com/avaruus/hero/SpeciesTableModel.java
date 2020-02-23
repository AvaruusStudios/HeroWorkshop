package com.avaruus.hero;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @name SpeciesTableModel.java
 * @author Avaruus Studios
 * @date Feb 23, 2020
 */
public class SpeciesTableModel {
    private final SimpleStringProperty SpeciesName;
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

    public String getSpeciesSize() {
        return SpeciesSize.get();
    }

    public Integer getSpeciesSpeed() {
        return SpeciesSpeed.get();
    }
}
