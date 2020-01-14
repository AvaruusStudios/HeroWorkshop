package com.avaruus.heroworkshop.ui.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import org.springframework.stereotype.Controller;
import com.avaruus.hero.AbilityModel;
import javafx.collections.ListChangeListener;

/*
    SummaryTab is the code-behind file for src/main/resources/fxml/tabs/summary.fxml
 */
@Controller
public class SummaryTab {
    // autowire a reference to the label in the Summary tab by its fx:id
    // @FXML private Label summaryLabel;
    @FXML private ComboBox cmbGender;
    @FXML private ComboBox cmbDominantHand;
    @FXML private ComboBox cmbSpecies;
    @FXML private TableView<AbilityModel> tblAbilities;
    @FXML private TableColumn<AbilityModel, String> colAbilityName;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityScore;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityModifier;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityAdjustableScore;
    @FXML private TableColumn<AbilityModel, Integer> colAbilitySpeciesAdjustment;
    @FXML private TableColumn<AbilityModel, Integer> colAbilityMiscAdjustment;

    public SummaryTab() {
    }

    @FXML
    private void initialize() {
        // set the text on the summary label
        // summaryLabel.setText("Summary");
        
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
