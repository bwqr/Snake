package main;

import game.Point;
import snake.Game;
import snake.Snake;
import ui.ApplicationWindow;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                // Create GridGame
                // You can change the world width and height, size of each grid square in pixels or the GridGame speed
                Game game = new Game(5, 5, 10, 30);

                for (int i = 0; i < 1; i++) {

                    Point[] points = {
                            new Point(1,1 + i),
                            new Point(2, 1 + i),
                            new Point(3, 1 + i),
                            new Point(4, 1 + i)
                    };

                    game.addSnake(new Snake(points));
                }


                // Create application window that contains the GridGame panel
                ApplicationWindow window = new ApplicationWindow(game.getGamePanel());
                window.getFrame().setVisible(true);

                // Start GridGame
                game.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
