package org.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    private double rotationAngle = 0; // Track the current rotation angle

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Success!");
        rotationAngle += 90; // Increase rotation by 90 degrees
        welcomeText.setRotate(rotationAngle % 360); // Ensure rotation stays within 0-360 degrees
    }
}
