package monopoly;

/**
 *
 * @author w.gore
 */
public class Space {
    
    private boolean isProperty;
    private int price;
    private int rent;
    private boolean owned;
    private String colour;
    
    // creates non-buyable properties like GO
    public void Space(int rent) {
        
    }
    
    // creates buyable properties
    public void Space(boolean isProperty, int price, int rent, String colour) {
        
    }
}
