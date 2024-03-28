package Decorator.Food;

import java.util.ArrayList;

public class FoodItemWithMustard extends FoodItem{
    private FoodItem food;
    private double price;
    public  FoodItemWithMustard (FoodItem food, Double price){
        this.price = price;
        this.food = food;
        this.food.getToppings().add("Mustard");
    }

    @Override
    public Double getPrice() {
        return this.price + this.food.getPrice();
    }

    @Override
    public String getName() {
        return this.food.getName();
    }

    @Override
    public ArrayList<String> getToppings() {
        return this.food.getToppings();
    }
}
