package monopoly;

import static monopoly.Monopoly.players;

/**
 *
 * @author Will Gore & Raden Pablo
 */
public class CC {

    public int move;

    public CC(Player player, int num) {
        if (num == 1) {
            player.goToJail();
            System.out.println(player.space);
        } else if (num == 2) {
            player.space = 39;
            player.output("Advance to Boardwalk");
            player.checkSpace();
            System.out.println(player.space);
        } else if (num == 3) {
            player.space = 39;
            player.output("Advance to the nearest railroad");
            player.checkSpace();
            System.out.println(player.space);
        } else if (num == 4) {
            player.output("Congrats you gained 50"
            System.out.println(player.space);
        }
    }

}
