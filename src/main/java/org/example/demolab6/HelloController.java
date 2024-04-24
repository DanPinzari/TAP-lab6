package org.example.demolab6;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private Pane rootPane;

    @FXML
    private Button restartButton;

    private Ball ball;

    @FXML
    public void initialize() {
        // Crearea obiectului pentru mingea
        ball = new Ball();
        rootPane.getChildren().add(ball.getCircle());


        restartButton.setOnAction(event -> ball.reset());//rst btn

        // pt a actualiza poziția mingii
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ball.move();
            }
        };
        timer.start();
    }
}
