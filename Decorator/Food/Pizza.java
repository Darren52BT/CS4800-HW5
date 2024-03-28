package Decorator.Food;

import java.util.ArrayList;

public class Pizza extends FoodItem{

    private String name;
    private ArrayList<String> toppings;
    private Double price;


    public Pizza( Double price){
        this.name = "Pizza";
        this.price = price;
        this.toppings = new ArrayList<String>();
    }


    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        String foodName = this.name;

        if(this.toppings.size() > 0 ){
            foodName += " with ";
        }
        for (String topping : this.toppings){
            foodName += topping + ",";
        }

        return foodName;
    }

    @Override
    public ArrayList<String> getToppings() {
        return this.toppings;
    }
}