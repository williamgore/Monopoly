package monopoly;

import static monopoly.Monopoly.board;

import static monopoly.Monopoly.bank;
import static monopoly.Monopoly.players;
import static monopoly.Monopoly.turn;

/**
 *
 * @author Will Gore & Raden Pablo
 */
public class Space {
    
    public String name;
    public boolean isProperty;
    public int price;
    public int rent;
    public boolean owned = false;
    public boolean isRailroad;
    public boolean isUtility;
    public boolean isCC;
    private String colour;
    public Player owner;
    
    // creates non-buyable properties like GO
    public Space(int rent, String name) {
        owner = bank;
        this.name = name;
        isProperty = false;
        this.rent = rent;
        isRailroad = false;
    }
    
    // creates buyable properties
    public Space(int price, int rent, String colour, String name) {
        owner = bank;
        this.price = price;
        this.rent = rent;
        this.colour = colour;
        this.name = name;
        isRailroad = false;
        isProperty = true;
        owned = false;
    }
    
    
    public Space(String name){
        isCC = true;
        owned = true;
        owner = bank;
        this.name = name;
        rent = -50;
    } 
    
    // Creates railroads
    public Space(boolean isRailroad, int price, String name){
        owned = false;
        this.isProperty = true;
        this.name = name;
        this.price = price;
        this.isRailroad = true;
    } 
    
    /**
     * Creates utilities, water works and electric company
     * @param name
     * @param price 
     */
    public Space(String name, int price){
        isUtility = true;
        isProperty = true;
        this.name = name;
        this.price = price;
    }
    

    public Space(boolean jailed, String name) {
        this.name = name;
    }
    
    public void buy() {
        owned = true;
        owner = players[turn];
        players[turn].cash -= price;
        bank.output(players[turn].name + " bought " + this.name +
                " for $" + price);
    }
}
