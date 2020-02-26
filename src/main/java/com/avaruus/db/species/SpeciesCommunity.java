/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avaruus.db.species;

import java.util.List;

/**
 * @name SpeciesCommunity.java
 * @author Avaruus Studios
 * @date Jan 22, 2020
 */
public class SpeciesCommunity {
	
	private List<SpeciesModel> Species;
	
	public List<SpeciesModel> getSpecies() {
		return Species;
	}
	
	public void setSpecies(List<SpeciesModel> Species) {
		this.Species = Species;
	}
}
