package edu.gmu.cs321;

import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

        primaryStage.setTitle("Data Entry Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Form Retrieval");
        sceneTitle.setFont(Font.font("Monocraft", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);
    }

    public static void main(String[] args){
        launch(args);
    }
}