package com.avaruus.db.core.species;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KnownLanguages {
	
	@JsonProperty("Basic")
	private boolean basic;
	
	@JsonProperty("Bothese")
	private boolean bothese;
	
	@JsonProperty("Cerean")
	private boolean cerean;
	
	@JsonProperty("Dosh")
	private boolean dosh;
	
	@JsonProperty("Durese")
	private boolean durese;
	
	@JsonProperty("Ewokese")
	private boolean ewokese;
	
	@JsonProperty("Gamorrean")
	private boolean gamorrean;
	
	@JsonProperty("Geonosian")
	private boolean geonosian;
	
	@JsonProperty("Gungan")
	private boolean gungan;
	
	@JsonProperty("Huttese")
	private boolean huttese;
	
	@JsonProperty("Ithorian")
	private boolean ithorian;
	
	@JsonProperty("Java Trade Language")
	private boolean jawa;
	
	@JsonProperty("Kaminoan")
	private boolean kaminoan;
	
	@JsonProperty("Neimodian")
	private boolean neimodian;
	
	@JsonProperty("Quarrenese")
	private boolean quarrenese;
	
	@JsonProperty("Rodese")
	private boolean rodese;
	
	@JsonProperty("Ryl")
	private boolean twileki;
	
	@JsonProperty("Sith")
	private boolean sith;
	
	@JsonProperty("Sullustese")
	private boolean sullustese;
	
	@JsonProperty("Yuuzhan Vong")
	private boolean yuuzhan;
	
	@JsonProperty("Zabrak")
	private boolean zabrak;
	
	private List<String> knownLangs;
	
	public List<String> getKnownLanguages() {
		if (knownLangs == null) {
			knownLangs = new ArrayList<String>();
			if (basic) knownLangs.add("Basic");
			if (bothese) knownLangs.add("Bothese");
			if (cerean) knownLangs.add("Cerean");
			if (dosh) knownLangs.add("Dosh");
			if (durese) knownLangs.add("Durese");
			if (ewokese) knownLangs.add("Ewokese");
			if (gamorrean) knownLangs.add("Gamorrean");
			if (geonosian) knownLangs.add("Geonosian");
			if (gungan) knownLangs.add("Gungan");
			if (huttese) knownLangs.add("Huttese");
			if (ithorian) knownLangs.add("Ithorian");
			if (jawa) knownLangs.add("Java Trade Language");
			if (kaminoan) knownLangs.add("Kaminoan");
			if (neimodian) knownLangs.add("Neimodian");
			if (quarrenese) knownLangs.add("Quarrenese");
			if (rodese) knownLangs.add("Rodese");
			if (twileki) knownLangs.add("Twileki");
			if (sith) knownLangs.add("Sith");
			if (sullustese) knownLangs.add("Sullustese");
			if (yuuzhan) knownLangs.add("Yuuzhan Vong");
			if (zabrak) knownLangs.add("Zabrak");
		}
		return knownLangs;
	}
}
