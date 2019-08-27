package com.avaruus.heroworkshop.ui.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.springframework.stereotype.Controller;

/*
    SummaryTab is the code-behind file for src/main/resources/fxml/tabs/summary.fxml
 */
@Controller
public class SummaryTab {
    // autowire a reference to the label in the Summary tab by its fx:id
    @FXML private Label summaryLabel;
    @FXML private ChoiceBox genderChoiceBox;
    @FXML private ChoiceBox dominantHandChoiceBox;

    public SummaryTab() {
    }

    @FXML
    private void initialize() {
        // set the text on the summary label
        // summaryLabel.setText("Summary");
        
        // set the choice for the gender choicebox
        genderChoiceBox.setItems(FXCollections.observableArrayList(
            "Male", "Female")
        );
        
        // set the choices for the handed choicebox
        dominantHandChoiceBox.setItems(FXCollections.observableArrayList(
            "Right", "Left")
        );
    }
}
