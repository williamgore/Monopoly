package monopoly;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Monopoly.java -
 *
 * @author William Gore & Raden Pablo
 * @since 23-May-2019
 */
public class Monopoly {

    final static String TITLE = "Monopoly";
    final static String imageFile = "C:\\Users\\w.gore\\Desktop\\Monopoly.png";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = intro();
        checkChoice(choice);
    }
    /**
     * Welcomes the player to the program
     * @return - returns the choice of action
     */
    private static int intro() {
        String[] options = {"Play Game", "Rules", "Quit"};
        Icon picture = new ImageIcon(imageFile);
        int choice = JOptionPane.showOptionDialog(
                null, 
                "Welcome to Monopoly!\n"
                        + "What would you like to do?", 
                TITLE, 
                0, 
                0, 
                picture, 
                options, 
                TITLE);
        return choice;
    }

    private static void checkChoice(int choice) {
        if(choice == 0) {
            playGame();
        }
        else if(choice == 1) {
            showRules();
        }
        else {
            close();
        }
    }

    private static void playGame() {
    }

    private static void close() {
        output("Thank you for using our program!");
        System.exit(0);
    }

    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    private static void showRules() {
        output("");
    }
}
