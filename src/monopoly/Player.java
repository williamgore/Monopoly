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
        int doubles = 0;
        boolean isDouble = roll();
        while(isDouble == true && doubles < 3) {
            isDouble = roll();
            doubles++;
            System.out.println(isDouble + "\n" + doubles);
        }
        
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
        int dice2 = random(1, 2);
        int move = dice1 + dice2;
        move(move);
        System.out.println(move);
        if (dice1 == dice2){
            return true;
        }
        return false;
    }

    private void move(int move) {
        space += move;
    }
}
