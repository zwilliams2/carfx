package edu.guilford;

import java.util.Random;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CarPane extends GridPane{

    // instantiate a car attribute
    private Car car;

    // Instantiate labels for make, model, and year
    private Label makeLabel;
    private Label modelLabel;
    private Label yearLabel;

    // Instatiate a text field for make, model, and year
    private TextField makeTextField;
    private TextField modelTextField;
    private TextField yearTextField;

    // Instantiate a button for make, model, and year
    private Button makeButton;
    private Button modelButton;
    private Button yearButton;

    // Instantiate a color change button
    private Button colorButton;

    // Instantiate a random object
    Random rand = new Random();


    // set the labels, text fields, and buttons
    public CarPane(Car car) {
        this.car = car;
        this.makeLabel = new Label("Make: "+ car.getMake());
        this.modelLabel = new Label("Model: "+ car.getModel());
        this.yearLabel = new Label("Year: "+ car.getYear());
        this.makeTextField = new TextField();
        this.modelTextField = new TextField();
        this.yearTextField = new TextField();
        this.makeButton = new Button("Set Make");
        this.modelButton = new Button("Set Model");
        this.yearButton = new Button("Set Year");
        this.colorButton = new Button("Change Color");



        // add the labels, text fields, and buttons to the grid pane
        this.add(makeLabel, 0, 0);
        this.add(modelLabel, 0, 1);
        this.add(yearLabel, 0, 2);

        //add the text fields to the pane next to the labels
        this.add(makeTextField, 1, 0);
        this.add(modelTextField, 1, 1);
        this.add(yearTextField, 1, 2);

        // add the buttons to the pane next to the text fields
        this.add(makeButton, 2, 0);
        this.add(modelButton, 2, 1);
        this.add(yearButton, 2, 2);
        this.add(colorButton, 0, 3);

        // set the grid pane to be visible
        this.setVisible(true);

        // add an event handler to the make, model, and year button to get user input from the text field
        // and set it to the label

        //add an event listner to the button 

        makeButton.setOnAction(e -> {
            // get the text from the text field
            String make = makeTextField.getText();
            // set the text to the label
            makeLabel.setText("Make: " + make);
            // set the make attribute of the car object
            car.setMake(make);
        });
        // add an event handler to the model button
        modelButton.setOnAction(e -> {
            // get the text from the text field
            String model = modelTextField.getText();
            // set the text to the label
            modelLabel.setText("Model: " + model);
            // set the model attribute of the car object
            car.setModel(model);
        });
        // add an event handler to the year button
        yearButton.setOnAction(e -> {
            // get the text from the text field
            String year = yearTextField.getText();
            // set the text to the label
            yearLabel.setText("Year: " + year);
            // set the year attribute of the car object
            car.setYear(Integer.parseInt(year));
        });
        //space out the grid pane
        this.setHgap(10);
        this.setVgap(10);

        //create an array of colors
        String[] colors = {"red", "blue", "green", "yellow", "orange", "purple", "pink", "black", "white", "gray"};

        // add an event handler to the color button to change the color of the background
        colorButton.setOnAction(e -> {
            // get a random number between 0 and 9
            int randomNum = rand.nextInt(10);
            // get the color from the array
            String color = colors[randomNum];
            // set the background color of the grid pane
            this.setStyle("-fx-background-color: " + color);
        });





       
        
       
    





    }
    
}
