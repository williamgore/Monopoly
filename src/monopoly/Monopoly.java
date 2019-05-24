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
        String choice = input("Please enter the number of players\n"
                + "from 2 - 6:");
        
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

    private static String input(String text) {
        String choice = JOptionPane.showInputDialog(
                null, 
                text, 
                TITLE, 
                3);
        return choice;
    }
    /**
     * Converts a String to an integer and calls isNumber
     *
     * @param input
     * @return
     */
    private static int convert(String input) {
        //checks if the string is even an integer to begin with
        // this means that the isNumber method doesnt need to be
        // called every time we use a number
        if (isNumber(input) == false) {
            return 0;
        }
        //converts the integer
        int output = Integer.parseInt(input);
        //returns the integer
        return output;
    }
    /**
     * Checks for valid inputs
     *
     * @param input - input given by the user
     * @return - returns true or false
     */
    private static boolean isNumber(String input) {
        if (input == null) {
            System.out.println("null string");
            return false;
        } else if (input.equals("")) {
            System.out.println("empty string");
            return false;
        } else {
            // check for letters, non-digits
            int decimalCount = 0;
            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);

                int ascii = (int) character;

                if (character == '.' && i != 0) {
                    if (decimalCount <= 1) { // ok, move on                        
                        decimalCount++;
                    } else {
                        return false;
                    }
                } else if (ascii == 45) {
                    if (i != 0) {
                        // ok, negative not in first spot
                        return false;
                    }
                } else if (Character.isDigit(character) == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
