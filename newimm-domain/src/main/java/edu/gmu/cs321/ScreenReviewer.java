package edu.gmu.cs321;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScreenReviewer extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Immigrant Request Reviewer");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Title
        Text scenetitle = new Text("Review Immigrant Case");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label nameLabel = new Label("Immigrant Name:");
        grid.add(nameLabel, 0, 2);
        
        TextField nameField = new TextField();
        grid.add(nameField, 1, 2);

        Label decisionLabel = new Label("Decision:");
        grid.add(decisionLabel, 0, 4);

        Label commentsLabel = new Label("Comments:");
        grid.add(commentsLabel, 0, 5);
        
        Label commentsArea = new Label();
        grid.add(commentsArea, 1, 5);

        Button submitBtn = new Button("Submit");
        grid.add(submitBtn, 1, 6);

        nameField.setText("John Doe");

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

