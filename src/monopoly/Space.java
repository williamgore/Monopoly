package monopoly;

/**
 *
 * @author Will Gore & Raden Pablo
 */
public class Space {
    
    private String name;
    private boolean isProperty;
    private int price;
    private int rent;
    private boolean owned;
    private String colour;
    
    // creates non-buyable properties like GO
    public Space(int rent) {
        isProperty = false;
        this.rent = rent;
        owned = true;
    }
    
    // creates buyable properties
    public Space(int price, int rent, String colour, String name) {
        this.price = price;
        this.rent = rent;
        this.colour = colour;
        this.name = name;
        isProperty = true;
    }
}
