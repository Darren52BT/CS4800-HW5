package Decorator.Food;

import java.util.ArrayList;

public class FoodItemWithChili extends FoodItem{
    private FoodItem food;
    private double price;
    public  FoodItemWithChili (FoodItem food, Double price){
        this.price = price;
        this.food = food;
        this.food.getToppings().add("Chili");
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
