package edu.gmu.cs321;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class ScreenReviewerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

    @FXML
    private void handleSendReviewButtonAction() {
        System.out.println("Sent review");
        sendReview();
    }
    /**
     * Receives information from form input and loads into reviewer screen to review.
     * @return if the data was correctly loaded
     */
    public boolean loadData() {
        return false;
    }
    /**
     * Based on manual check, reviewer will send back judgement to the workflow. If information is acceptable,
     * continues to next workflow step. If not, goes back into data entry.
     * @return if the information was passable
     */
    public boolean sendReview() {
        return false;
    }
}
