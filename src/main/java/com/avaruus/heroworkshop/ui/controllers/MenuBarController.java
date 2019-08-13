package com.avaruus.heroworkshop.ui.controllers;

import javafx.event.ActionEvent;
import org.springframework.stereotype.Controller;

/*
    MenuBarController is the code-behind file for src/main/resources/fxml/menubar.fxml
 */
@Controller
public class MenuBarController {
    public MenuBarController() {
    }

    public void onMenuItemExitAction(ActionEvent event) {
        // perform the action for the Exit menu item which will close the application
        System.exit(0);
    }
}
