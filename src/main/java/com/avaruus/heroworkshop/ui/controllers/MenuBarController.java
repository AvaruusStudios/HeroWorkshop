package com.avaruus.heroworkshop.ui.controllers;

import javafx.event.ActionEvent;
import org.springframework.stereotype.Controller;

@Controller
public class MenuBarController {
    public MenuBarController() {

    }

    public void onMenuItemExitAction(ActionEvent event) {
        System.exit(0);
    }
}
