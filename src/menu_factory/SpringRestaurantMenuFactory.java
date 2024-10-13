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
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        // Add the required code here
        return new SpringDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        // Add the required code here
         return new SpringMainCourse();
    }

    @Override    
    public Entree createEntree() {
        // Add the required code here
         return new SpringEntree();
    }

    @Override    
    public Dessert createDessert() {
        // Add the required code here
        return new SpringDessert();
    } 
}
