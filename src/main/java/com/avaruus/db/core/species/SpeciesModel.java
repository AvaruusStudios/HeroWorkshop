/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avaruus.db.core.species;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @name SpeciesModel.java
 * @author Avaruus Studios
 * @date Jan 22, 2020
 */
public class SpeciesModel {
	
	private Integer id;
	private String name;
	private String description;
	private String personality;
	private String appearance;
	private String homeworld;
	private String languages;
	private String adventurers;
	@JsonProperty("knownlanguages")
	private KnownLanguages knownlanguages;
	private String size;
	private Integer speed;	
	
	
	SpeciesModel() {
		this.id = id;
		this.name = name;
		this.description = description;
		this.personality = personality;
		this.appearance = appearance;
		this.homeworld = homeworld;
		this.languages = languages;
		this.adventurers = adventurers;
		this.knownlanguages = knownlanguages;
		this.size = size;
		this.speed = speed;		
	}
	
	@Override
	public String toString() {
		return name;
//		return "Species [id:" + id + ", Species Name:" + name + "]";
//		return "Species [id:" + id + ", Species Name:" + name + ", Species Description:" + description +
//				", Species Personality:" + personality + ", Species Appearance:" + appearance +
//				", Species Homeworld:" + homeworld + ", Species Languages:" + languages + 
//				", Species Background:" + background + ", Species Size:" + size + ", Species Speed:" + speed + "]";	
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
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
	
	public String getLanguages() {
		return languages;
	}
	
	public String getAdventurers() {
		return adventurers;
	}
	
	public String getSize() {
		return size;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public KnownLanguages getKnownLanguages(){
		return knownlanguages;
	}
}
