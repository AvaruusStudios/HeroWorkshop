/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avaruus.db.core;

import java.util.*;

/**
 * @name SpeciesModel.java
 * @author Avaruus Studios
 * @date Aug 29, 2019
 */
public class SpeciesModel {
    private String name;
    private String description;
    private String personality;
    private String appearance;
    private String homeworld;
    private String language;
    private String background;
    private List<String> knownlanguages;
    private String size;
    private String speed;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getPersonality() {
        return personality;
    }
    
    public String getAppearance() {
        return appearance;
    }
    
    public String getHomeworld() {
        return homeworld;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getBackground() {
        return background;
    }
    
    public List<String> getKnownLanguages() {
        return knownlanguages;
    }
    
    public String getSize() {
        return size;
    }
    
    public String getSpeed() {
        return speed;
    }
}
