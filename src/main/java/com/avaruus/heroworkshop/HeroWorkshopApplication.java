package com.avaruus.heroworkshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HeroWorkshopApplication extends Application {
    private ConfigurableApplicationContext context;
    private Parent rootNode;

    public static void main(final String[] args) {
        launch(HeroWorkshopApplication.class, args);
    }

    @Override
    public void init() throws Exception {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(HeroWorkshopApplication.class);
        context = builder.run(getParameters().getRaw().toArray(new String[0]));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
        loader.setControllerFactory(context::getBean);
        rootNode = loader.load();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        double width = 600.0;
        double height = 400.0;

        primaryStage.setScene(new Scene(rootNode, width, height));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/d20.png")));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        context.close();
    }

}
