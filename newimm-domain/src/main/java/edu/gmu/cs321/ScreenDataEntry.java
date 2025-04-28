/*
 * Copyright (c) 2012, 2014 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 * Modified by Jakob Elmore
 */
package edu.gmu.cs321;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.HPos.RIGHT;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * The form to allow for Immigrants to submit their personal information to get
 * previously submitted immigration form.
 */
public class ScreenDataEntry extends Application {
    /**
     * Grid to place items into
     */
    private GridPane grid = new GridPane();

    /**
     * Tracks number of text boxes
     */
    private int textBoxCounter = 1;

    /**
     * Stores all text box objects
     */
    private ArrayList<TextField> textFields;

    /**
     * Tracks number of Dependent Text Boxes
     */
    private int dependentTextBoxCounter = 1;

    /**
     * Tracks number of Dependent being added
     */
    private int numDependents = 1;

    /**
     * Immigrant object created when using the form.
     */
    private Immigrant newImm = new Immigrant();

    /**
     * List of Dependents to the Immigrant.
     */
    private ArrayList<Dependent> dependents = new ArrayList<Dependent>();

    /**
     * Adds text boxes for the Immigrant
     * @param text
     */
    private void addTextBox(String text){
        Label label = new Label(text);
        grid.add(label, 0, textBoxCounter);

        TextField textBox = new TextField();
        grid.add(textBox, 1, textBoxCounter);
        textFields.add(textBox);
        textBoxCounter++;
    }

    /**
     * Adds text boxes for the Dependent next to the Immigrant
     * @param text
     */
    private void addDependentTextBox(String text){
        Label label = new Label(text);
        TextField textBox = new TextField();
        grid.add(label, 3, dependentTextBoxCounter);
        grid.add(textBox, 4, dependentTextBoxCounter);
        textFields.add(textBox);
        dependentTextBoxCounter++;
    }

    private void createImmigrant(){
        newImm.setFirstName(textFields.get(0).getText());
        newImm.setLastName(textFields.get(1).getText());
        newImm.setDoB(textFields.get(2).getText());
        newImm.setAddress(textFields.get(3).getText());
        newImm.setEmail(textFields.get(4).getText());
    }

    private void addDependents(){
        int i = 5;
        while (i < dependentTextBoxCounter){
            Dependent newDep = new Dependent(
                textFields.get(i).getText(),
                textFields.get(i+1).getText(),
                textFields.get(i+2).getText(),
                newImm
            );
            dependents.add(newDep);
            i += 3;
        }
    }

    /**
     * Builds the screen
     */
    @Override
    public void start(Stage primaryStage) {
        textFields = new ArrayList<TextField>();

        //builds the initial screen
        primaryStage.setTitle("Immigration Data Entry");
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //adds Immigrant textboxes
        addTextBox("First Name: ");

        addTextBox("Last Name: ");

        addTextBox("Date of Birth: ");

        addTextBox("Address: ");

        addTextBox("Email: ");

        //creates the buttons
        Button btn = new Button("Submit Form");
        HBox hbBtn = new HBox(10);

        Button dependentButton = new Button("Add dependent");
        grid.add(dependentButton, 0, textBoxCounter + 1);

        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 0, textBoxCounter + 2);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 6);
        grid.setColumnSpan(actiontarget, 2);
        grid.setHalignment(actiontarget, RIGHT);
        actiontarget.setId("actiontarget");

        // Immigrant newImm;

        //submit button action
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);

                for (TextField field: textFields){
                    if (field.lengthProperty().intValue() == 0){
                        actiontarget.setText("Missing a field");
                        return;
                    }
                }

                createImmigrant();
                addDependents();
                newImm.setDependents(dependents);
                actiontarget.setText("Successfully submitted the form.");


            }
        });

        //add dependent button action
        dependentButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                addDependentTextBox((numDependents) + ". Dependent First Name: ");
                addDependentTextBox((numDependents) + ". Dependent Last Name: ");
                addDependentTextBox((numDependents) + ". Dependent Date of Birth: ");
                numDependents ++;
            }
        });

        Scene scene = new Scene(grid, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Main method to run the screen, mostly for testing
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}