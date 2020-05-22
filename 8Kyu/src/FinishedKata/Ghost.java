package FinishedKata;

import java.util.Random;

public class Ghost {
    private String color;

    Random random = new Random();

    public Ghost(){
        int chosenColor = new Random().nextInt(4);
        switch (chosenColor){
            case 0:
                color = "white";
                return;
            case 1:
                color = "yellow";
                return;
            case 2:
                color = "purple";
                return;
            case 3:
                color = "red";
                return;
        }
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());
    }
}
