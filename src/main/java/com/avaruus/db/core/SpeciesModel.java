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
    private Map<String, Boolean> knownlanguages;
    private String size;
    private String speed;
	private Map<String, Integer> abilities;
    
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
	
	public void setPersonality(String personality) {
		this.personality = personality;
	}
    
    public String getAppearance() {
        return appearance;
    }
	
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
    
    public String getHomeworld() {
        return homeworld;
    }
	
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
    
    public String getLanguage() {
        return language;
    }
	
	public void setLanguage(String language) {
		this.language = language;
	}
    
    public String getBackground() {
        return background;
    }
	
	public void setBackgound(String background) {
		this.background = background;
	}
    
    public Map<String, Boolean> getKnownLanguages() {
        return knownlanguages;
    }
	
	public void setKnownLanguages(Map<String, Boolean> knownlanguages) {
		this.knownlanguages = knownlanguages;
	}
    
    public String getSize() {
        return size;
    }
	
	public void setSize(String size) {
		this.size = size;
	}
    
    public String getSpeed() {
        return speed;
    }
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public Map<String, Integer> getAbilities() {
		return abilities;
	}
	
	public void setAbilities(Map<String, Integer> abilities) {
		this.abilities = abilities;
	}
}
