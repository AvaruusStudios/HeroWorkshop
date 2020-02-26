/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avaruus.db;

import java.io.File;
import java.io.IOException;

import com.avaruus.db.species.SpeciesCommunity;
import com.avaruus.db.species.SpeciesModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @name JsonConnection.java
 * @author Avaruus Studios
 * @date Feb 3, 2020
 */
public class JsonConnection {

	private static JsonConnection instance;
	
	private ObjectMapper objectMapper;
	
	private ObservableList<String> SpeciesList = FXCollections.observableArrayList();
	
	private JsonConnection() {
		objectMapper = new ObjectMapper();		
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		File coreRulebook = new File("src/main/resources/db/core_rulebook.json");
		
		try {
			SpeciesCommunity sc = objectMapper.readValue(coreRulebook, SpeciesCommunity.class);
			for (SpeciesModel species : sc.getSpecies()) {
				SpeciesList.add(species.getName());
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (JsonMappingException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		
	}
	
	public ObservableList<String> getSpeciesList() {
		return SpeciesList;
	}
	
	private static void createInstance() {
		instance = new JsonConnection();
	}
	
	public static JsonConnection getInstance() {
		if (instance == null) createInstance();
		return instance;
	}
}
