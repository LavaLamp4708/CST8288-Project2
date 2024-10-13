/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.*;

/**
 *
 * @author gouraya
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {
    
    @Override
    public Drink createDrink() {
        // Add the required code here
        return new WinterDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        // Add the required code here
         return new WinterMainCourse();
    }

    @Override    
    public Entree createEntree() {
        // Add the required code here
         return new WinterEntree();
    }

    @Override    
    public Dessert createDessert() {
        // Add the required code here
        return new WinterDessert();
    }   
    
}
