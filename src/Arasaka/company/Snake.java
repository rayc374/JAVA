package Arasaka.company;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Node> snakeBody;

    public Snake(){
        snakeBody = new ArrayList<>();
        snakeBody.add(new Node(180,0));
        snakeBody.add(new Node(160,0));
        snakeBody.add(new Node(140,0));
        snakeBody.add(new Node(120,0));
    }
    public ArrayList<Node> getSnakeBody(){
        return snakeBody;
    }
    public void drawSnake(Graphics g) {
        for (int i = 0; i < snakeBody.size(); i++) {
            if (i == 0) {
                g.setColor(new Color(50, 205, 50));
            } else {
                g.setColor(new Color(255, 114, 86));
            }


        Node n = snakeBody.get(i);
        if (n.x >= Main.width) {
            n.x = 0;
        }
        if (n.x < 0) {
            n.x = Main.width - Main.CELL_SIZE;
        }
        if (n.y >= Main.height) {
            n.y = 0;
        }
        if (n.y < 0) {
            n.y = Main.height - Main.CELL_SIZE;
        }
        g.fillOval(n.x, n.y, Main.CELL_SIZE, Main.CELL_SIZE);
        }
    }
}
