package com.avaruus.heroworkshop.ui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Controller;

@Controller
public class SummaryTab {
    @FXML private Label summaryLabel;

    public SummaryTab() {

    }

    @FXML
    private void initialize() {
        summaryLabel.setText("Summary"); // showing how to initialize FXML controls
    }
}
