package monopoly;

import static monopoly.Monopoly.players;
//import static monopoly.Monopoly.turn;

/**
 *
 * @author Will Gore & Raden Pablo
 */
public class Space {
    
    public String name;
    public boolean isProperty;
    public int price;
    public int rent;
    public boolean owned;
    public boolean isRailroad;
    private String colour;
    public Player owner;
    
    // creates non-buyable properties like GO
    public Space(int rent, String name) {
        this.name = name;
        isProperty = false;
        this.rent = rent;
        owned = true;
        isRailroad = false;
    }
    
    // creates buyable properties
    public Space(int price, int rent, String colour, String name) {
        this.price = price;
        this.rent = rent;
        this.colour = colour;
        this.name = name;
        isRailroad = false;
        isProperty = true;
    }
    
    public Space(String name){
        this.name = name;
        rent = -50;
    } 
    
    public Space(boolean isRailroad, int price, String name){
        this.name = name;
        this.price = price;
        this.isRailroad = true;
    } 
    
    public Space(String name, int price){
        isProperty = true;
        this.name = name;
        this.price = price;
    }

    public Space(boolean jailed, String name) {
        this.name = name;
    }
    
    public void buy() {
        
    }
}
