package com.avaruus.db.core.abilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @name Hero.java
 * @author Avaruus Studios
 * @date Aug 28, 2019
 */
import javafx.beans.property.*;

public class AbilitiesTableModel {
    private final SimpleStringProperty AbilityName;
    private SimpleIntegerProperty AbilityScore;
    private SimpleIntegerProperty AbilityModifier;
    private SimpleIntegerProperty AbilityAdjustableScore;
    private SimpleIntegerProperty AbilitySpeciesAdjustment;
    private SimpleIntegerProperty AbilityMiscAdjustment;

    public AbilitiesTableModel(String AbilityName, Integer AbilityScore, Integer AbilityModifier, Integer AbilityAdjustableScore, Integer AbilitySpeciesAdjustment, Integer AbilityMiscAdjustment) {
        this.AbilityName = new SimpleStringProperty(AbilityName);
        this.AbilityScore = new SimpleIntegerProperty(AbilityScore);
        this.AbilityModifier = new SimpleIntegerProperty(AbilityModifier);
        this.AbilityAdjustableScore = new SimpleIntegerProperty(AbilityAdjustableScore);
        this.AbilitySpeciesAdjustment = new SimpleIntegerProperty(AbilitySpeciesAdjustment);
        this.AbilityMiscAdjustment = new SimpleIntegerProperty(AbilityMiscAdjustment);
    }
    
    public String getAbilityName() {
        return AbilityName.get();
    }
    
//    public void setAbilityName(String AbilityName) {
//        this.AbilityName = new SimpleStringProperty(AbilityName);
//    }
    
    public Integer getAbilityScore() {
        return AbilityScore.get();
    }
    
    public void setAbilityScore(int AbilityScore) {
        this.AbilityScore = new SimpleIntegerProperty(AbilityScore);
    }
    
    public Integer getAbilityModifier() {
        return AbilityModifier.get();
    }
    
    public void setAbilityModifier(int AbilityModifier) {
        this.AbilityModifier = new SimpleIntegerProperty(AbilityModifier);
    }
    
    public Integer getAbilityAdjustableScore() {
        return AbilityAdjustableScore.get();
    }
    
    public void setAbilityAdjustableScore(int AbilityAdjustableScore) {
        this.AbilityAdjustableScore = new SimpleIntegerProperty(AbilityAdjustableScore);
    }
    
    public Integer getAbilitySpeciesAdjustment() {
        return AbilitySpeciesAdjustment.get();
    }
    
    public void setAbilitySpeciesAdjustment(int AbilitySpeciesAdjustment) {
        this.AbilitySpeciesAdjustment = new SimpleIntegerProperty(AbilitySpeciesAdjustment);
    }
    
    public Integer getAbilityMiscAdjustment() {
        return AbilityMiscAdjustment.get();
    }
    
    public void setAbilityMiscAdjustment(int AbilityMiscAdjustment) {
        this.AbilityMiscAdjustment = new SimpleIntegerProperty(AbilityMiscAdjustment);
    }
}
