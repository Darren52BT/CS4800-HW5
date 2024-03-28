package Decorator.Order;

import Decorator.Food.FoodItem;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> orderedFoods;

    public Order(){
        this.orderedFoods = new ArrayList<FoodItem>();
    }


    public void addToOrder(FoodItem food){
        this.orderedFoods.add(food);
    }

    public void printOrder(){
        for (FoodItem food: this.orderedFoods){
            System.out.println(food.getName());
        }

    }
    public Double getTotalPrice(){
        Double total = 0.0;
        for (FoodItem food : this.orderedFoods){
            total += food.getPrice();
        }
        return total;
    }

}
