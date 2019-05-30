package monopoly;

import javax.swing.JOptionPane;
import static monopoly.Monopoly.TITLE;

/**
 * Players.java - to create players
 *
 * @author William Gore & Raden Pablo
 * @since 23-May-2019
 */
public class Player {

    private int cash = 1500;
    public String name;
    public int turn;
    public int people;
    private int space;

    /**
     *
     */
    public void Players() {
        space = 0;
        
    }

    /**
     * To create dices
     */
    public void takeTurn() {
        System.out.println("turn start " + name);
        int doubles = 0;
        boolean isDouble = roll();
        System.out.println(isDouble);
        while(isDouble == true && doubles < 2) {
            isDouble = roll();
            doubles++;
            System.out.println("is double " + isDouble);
            if(doubles == 2) {
                System.out.println("Go to Jail");
            }
        }
        
        checkSpace();
        
        if (cash == 0) {
            System.out.println("you lose");
        }
        System.out.println("turn end");
    }

    /**
     * Generates a random number
     *
     * @param low lowest number in the range
     * @param high highest number in the range
     * @return random number in range
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double value = (H - L + 1) * seed + L;
        int answer = (int) value;
        return answer;

    }

    private void nextTurn() {
        turn++;
    }

    private boolean roll() {
        int dice1 = random(1, 2);
        int dice2 = random(1, 1);
        int move = dice1 + dice2;
        System.out.println("Space " + space);
        System.out.println("dice1 " + dice1 + "\ndice2 " + dice2);
        move(move);
        if (dice1 == dice2){
            return true;
        }
        return false;
    }

    private void move(int move) {
        for (int i = 0; i < move; i++) {
           space++; 
           if(space == 40) {
               space = 0;
           }
        }
        
        System.out.println("space = " + space);
    }

    private void checkSpace() {
        for (int i = 0; i < 40; i++) {
            
        }
    }
}
