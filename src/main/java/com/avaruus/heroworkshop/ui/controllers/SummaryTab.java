package com.avaruus.heroworkshop.ui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Controller;

/*
    SummaryTab is the code-behind file for src/main/resources/fxml/tabs/summary.fxml
 */
@Controller
public class SummaryTab {
    // autowire a reference to the label in the Summary tab by its fx:id
    @FXML private Label summaryLabel;

    public SummaryTab() {
    }

    @FXML
    private void initialize() {
        // set the text on the summary label
        summaryLabel.setText("Summary");
    }
}
