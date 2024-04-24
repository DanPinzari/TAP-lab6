package org.example.demolab6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Ball {
    private Circle circle;
    private double x;
    private double y;
    private double speedX = 5; // Viteza pe axa X
    private double speedY = 5; // Viteza pe axa Y
    private double targetSize = 80; // Dimensiunea finală a mingii (atunci când se apropie)

    // Constructor
    public Ball() {
        this.circle = new Circle(10, Color.BLUE); // Mărimea inițială a mingii și culoarea
        this.x = 100; // Poziția inițială a mingii pe axa X
        this.y = 100; // Poziția inițială a mingii pe axa Y
        this.circle.setTranslateX(x);
        this.circle.setTranslateY(y);
    }

    // Metoda pentru deplasarea mingii
    public void move() {
        x += speedX;
        y += speedY;

        // Verificarea coliziunii cu marginile ferestrei
        if (x < 0 || x > 800) {
            speedX *= -1;
        }
        if (y < 0 || y > 600) {
            speedY *= -1;
        }

        // Actualizarea poziției mingii
        circle.setTranslateX(x);
        circle.setTranslateY(y);

        // Redimensionarea mingii pe măsură ce se apropie
        double distanceToTarget = Math.sqrt(Math.pow(x - 400, 2) + Math.pow(y - 300, 2));
        double newSize = 10 + (targetSize - 10) * (1 - distanceToTarget / 600);
        circle.setRadius(newSize);
    }

    // Metoda pentru resetarea poziției și dimensiunii mingii
    public void reset() {
        x = 100;
        y = 100;
        circle.setTranslateX(x);
        circle.setTranslateY(y);
        circle.setRadius(10);
    }

    // Metoda pentru obținerea cercului reprezentând mingea
    public Circle getCircle() {
        return circle;
    }
}
