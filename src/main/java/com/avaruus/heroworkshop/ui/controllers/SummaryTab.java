package com.avaruus.heroworkshop.ui.controllers;

import com.avaruus.db.core.SpeciesCommunity;
import com.avaruus.db.core.SpeciesModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import org.springframework.stereotype.Controller;
import com.avaruus.hero.AbilityModel;
import com.avaruus.hero.SingleStringColumn;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.collections.ListChangeListener;


/*
    SummaryTab is the code-behind file for src/main/resources/fxml/tabs/summary.fxml
 */
@Controller
public class SummaryTab {
    // autowire a reference to the label in the Summary tab by its fx:id
    // @FXML private Label summaryLabel;
    @FXML private ComboBox<String> cmbGender;
    @FXML private ComboBox<String> cmbDominantHand;
    @FXML private ComboBox<String> cmbSpecies;
    @FXML private TableView<AbilityModel> tblAbilities;
    @FXML private TableColumn<AbilityModel, String> colAbilityName;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityScore;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityModifier;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityAdjustableScore;
    @FXML private TableColumn<AbilityModel, Integer> colAbilitySpeciesAdjustment;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityMiscAdjustment;

    @FXML private TableView<SingleStringColumn> tblLanguages;
    @FXML private TableColumn<SingleStringColumn, String> colLang;
    
    private Map<String, ObservableList<SingleStringColumn>> knownLangsList;
    
    public SummaryTab() {
    }

    @FXML
    private void initialize() throws JsonParseException, JsonMappingException, IOException {
        // set the text on the summary label
        // summaryLabel.setText("Summary");
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		File coreRulebook = new File("src/main/resources/db/core_rulebook.json");
		
		SpeciesCommunity sc = objectMapper.readValue(coreRulebook, SpeciesCommunity.class);
		
		
		ObservableList<String> SpeciesList = FXCollections.observableArrayList();
		
		knownLangsList = new HashMap<String, ObservableList<SingleStringColumn>>();
		
		
		
		for (SpeciesModel species : sc.getSpecies()) {
//			System.out.println(species.getName());
			SpeciesList.add(species.getName());
			ObservableList<SingleStringColumn> list = FXCollections.observableArrayList();
			for (String str : species.getKnownLanguages().getKnownLanguages()) {
				list.add(new SingleStringColumn(str));
			}
			knownLangsList.put(species.getName(), list);
			//System.out.println(species.getKnownLanguages());
		}
		
				
		
		
		cmbSpecies.setItems(SpeciesList);
		cmbSpecies.getSelectionModel().selectedItemProperty().addListener((options, oldValue, newValue) -> {
			for (SpeciesModel species : sc.getSpecies()) {
				if (species.getName().equals(newValue)) {
					tblLanguages.setItems(knownLangsList.get(species.getName()));
				}
			}
		});
       
        // sets the options for the gender ComboBox
        cmbGender.setItems(FXCollections.observableArrayList(
            "Male", "Female")
        );
        
        // sets the options for the handed ComboBox
        cmbDominantHand.setItems(FXCollections.observableArrayList(
            "Right", "Left")
        );
        
        // displays the abilites data
        colAbilityName.setCellValueFactory(new PropertyValueFactory<>("AbilityName"));
        colAbilityScore.setCellValueFactory(new PropertyValueFactory<>("AbilityScore"));
        colAbilityModifier.setCellValueFactory(new PropertyValueFactory<>("AbilityModifier"));
        colAbilityAdjustableScore.setCellValueFactory(new PropertyValueFactory<>("AbilityAdjustableScore"));
        colAbilitySpeciesAdjustment.setCellValueFactory(new PropertyValueFactory<>("AbilitySpeciesAdjustment"));
        colAbilityMiscAdjustment.setCellValueFactory(new PropertyValueFactory<>("AbilityMiscAdjustment"));
        
        colLang.setCellValueFactory(new PropertyValueFactory<>("String"));
        
        // add data to table
        tblAbilities.setItems(AbilitiesList);
        
		// prevent columns from being reordered
        tblAbilities.getColumns().addListener(new ListChangeListener() {
            @Override
            public void onChanged(Change change) {
                change.next();
                if(change.wasReplaced()) {
                    tblAbilities.getColumns().clear();
                    tblAbilities.getColumns().addAll(colAbilityName, colAbilityScore, colAbilityModifier, colAbilityAdjustableScore, colAbilitySpeciesAdjustment, colAbilityMiscAdjustment);
                }
            }
        });
    }
    
	// creates an ObservableList of the character abilities
    private ObservableList<AbilityModel> AbilitiesList = FXCollections.observableArrayList(
        new AbilityModel("Strength", 0, 0, 0, 0, 0),
        new AbilityModel("Dexterity", 0, 0, 0, 0, 0),
        new AbilityModel("Constitution", 0, 0, 0, 0, 0),
        new AbilityModel("Intelligence", 0, 0, 0, 0, 0),
        new AbilityModel("Wisdom", 0, 0, 0, 0, 0),
        new AbilityModel("Charisma", 0, 0, 0, 0, 0)
    );
}
