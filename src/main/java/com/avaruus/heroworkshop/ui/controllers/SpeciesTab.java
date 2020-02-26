package com.avaruus.heroworkshop.ui.controllers;

import com.avaruus.db.species.SpeciesCommunity;
import com.avaruus.db.species.SpeciesModel;
import com.avaruus.db.species.SpeciesTableModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.IOException;

@Controller
public class SpeciesTab {

    public TableView<String> tblSpeciesSelectionList;

    @FXML
    private void initialize() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        File coreRulebook = new File("src/main/resources/db/core_rulebook.json");

        SpeciesCommunity speciesCommunity = objectMapper.readValue(coreRulebook, SpeciesCommunity.class);

        ObservableList<String> SpeciesSelectionList = FXCollections.observableArrayList();

        for (SpeciesModel species : speciesCommunity.getSpecies()) {
            // SpeciesSelectionList.add(species.getName(), species.getSize(), species.getSpeed().toString());
            SpeciesSelectionList.add(String.valueOf(new SpeciesTableModel( species.getName(), species.getSize(), species.getSpeed())));
//            System.out.println(species.getName());
//            System.out.println(species.getSize());
//            System.out.println(species.getSpeed());
        }

        System.out.println(SpeciesSelectionList);

        tblSpeciesSelectionList.setItems(SpeciesSelectionList);
    }
}
