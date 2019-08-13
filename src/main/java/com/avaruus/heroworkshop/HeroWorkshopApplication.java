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
        // boostrap the JavaFX-enabled spring boot application
        launch(HeroWorkshopApplication.class, args);
    }

    @Override
    public void init() throws Exception {
        // Initialize the spring boot application
        SpringApplicationBuilder builder = new SpringApplicationBuilder(HeroWorkshopApplication.class);

        // build the spring context
        context = builder.run(getParameters().getRaw().toArray(new String[0]));

        // load the main FXML file from the classpath, located in src/main/resources/fxml/main.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));

        // wire JavaFX to Spring
        loader.setControllerFactory(context::getBean);
        rootNode = loader.load();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        double width = 800.0;
        double height = 600.0;

        // create scene and set it on the JavaFX primary stage
        primaryStage.setScene(new Scene(rootNode, width, height));

        // set the application window title
        primaryStage.setTitle("Hero Workshop");

        // set the application icon
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/d20.png")));

        // center the application
        primaryStage.centerOnScreen();

        // render the application
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        // stop the spring context
        context.close();
    }

}
