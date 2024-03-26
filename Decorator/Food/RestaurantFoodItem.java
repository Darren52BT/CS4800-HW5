package Decorator.Food;

public class RestaurantFoodItem extends FoodItem{
    private Double cost;
    private String name;

    public RestaurantFoodItem(String name, Double cost){
        this.cost = cost;
        this.name = name;
    }
    @Override
    public Double getCost() {
        return this.cost;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
