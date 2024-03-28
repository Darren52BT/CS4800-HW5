package Decorator.Food;

import java.util.ArrayList;

public abstract class FoodItem {

    public abstract Double getPrice();
    public abstract String getName();

    public abstract ArrayList<String> getToppings();
}
