package monopoly;

import static monopoly.Monopoly.spaces;
import javax.swing.JOptionPane;
import static monopoly.Monopoly.TITLE;
import static monopoly.Monopoly.IMAGE_FILE;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Players.java - to create players
 *
 * @author William Gore & Raden Pablo
 * @since 23-May-2019
 */
public class Player {
    
    private int turns;
    public int cash;
    public String name;
    public int people;
    private int space;
    private boolean jailed;

    /**
     *
     */
    public Player(String name) {
        jailed = false;
        this.name = name;
        space = 0;
        cash = 1500;
    }

    /**
     * To create dices
     */
    public void takeTurn() {
        System.out.println("turn start " + name);
        if (jailed == false) {
            int doubles = 0;
            boolean isDouble = roll();
            System.out.println(isDouble);
            checkSpace();
            while (isDouble == true && doubles < 2) {
                isDouble = roll();
                doubles++;
                System.out.println("is double " + isDouble);
                checkSpace();
                if (doubles == 2) {
                    goToJail();
                    
                }
            }
        } else {
            turns++;
            if (roll() == true || turns == 3) {
                jailed = false;
            } else {
                System.out.println("Stay in jail!");
            }
        }
        if (cash == 0) {
            System.out.println("you lose");
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
    
    private boolean roll() {
        int dice1 = random(1, 6);
        int dice2 = random(1, 6);
        int move = dice1 + dice2;
        System.out.println("Space " + space);
        System.out.println("dice1 " + dice1 + "\ndice2 " + dice2);
        if (jailed == false) {
            move(move);
        }
        if (dice1 == dice2) {
            return true;
        }
        return false;
    }
    
    private void move(int move) {
        for (int i = 0; i < move; i++) {
            space++;            
            if (space == 40) {
                space = 0;
            }
        }
        
        System.out.println("space = " + space);
    }
    
    public void checkSpace() {
        Icon picture = new ImageIcon(IMAGE_FILE);
        output(name + " landed on " + spaces[space].name);
        if (spaces[space].isProperty == true) {
            if (spaces[space].owned = true) {
                
            } 
            else if(spaces[space].owned = false){
                
            }
        } 
        else if (space == 29) {
            goToJail();
        } 
        else {
            cash = cash - spaces[space].rent;
        }
    }
    
    private void output(Space space) {
        JOptionPane.showMessageDialog(
                null,
                "You landed on " + space + "!",
                TITLE,
                1);
        if (space.isProperty = true) {
            
        }
    }
    
    public void goToJail() {
        output("Go to jail!");
        jailed = true;
        space = 10;
        turns = 0;
    }
    
    private void output(String text) {
        Icon picture = new ImageIcon(IMAGE_FILE);
        JOptionPane.showMessageDialog(
                null,
                text,
                TITLE,
                JOptionPane.WARNING_MESSAGE,
                picture);
    }
}
