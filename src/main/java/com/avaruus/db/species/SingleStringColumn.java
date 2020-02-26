package com.avaruus.db.species;

import javafx.beans.property.SimpleStringProperty;

public class SingleStringColumn {

	private final SimpleStringProperty str;
	
	public SingleStringColumn(String str) {
		this.str = new SimpleStringProperty(str);
	}
	
	public String getString() {
		return str.get();
	}
}
