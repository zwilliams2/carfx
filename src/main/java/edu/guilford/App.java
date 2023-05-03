package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       // scene = new Scene(loadFXML("primary"), 640, 480);
       // Instantiate a vbox object
        VBox vbox = new VBox();
        // Instantiate a scene object
        scene = new Scene(vbox, 640, 480);
        // Instantiate a car object
        Car car = new Car();
        
        // Add the carPane object to the vbox object
        vbox.getChildren().add(new CarPane(car));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}