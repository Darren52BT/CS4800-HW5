package Decorator;

import Decorator.Food.*;
import Decorator.Loyalty.Loyalty;
import Decorator.Order.Order;

public class Driver {
    public static void main(String[] args) {
        FoodItem burgerWithKetchupAndMustard = new Burger(6.00);
        burgerWithKetchupAndMustard = new FoodItemWithKetchup(burgerWithKetchupAndMustard, .25);
        burgerWithKetchupAndMustard = new FoodItemWithMustard(burgerWithKetchupAndMustard, .30);

        System.out.println("Printing first food item");
        System.out.println(burgerWithKetchupAndMustard.getName());
        System.out.println(burgerWithKetchupAndMustard.getPrice());


        FoodItem hotDogWithChiliandPepperoni = new HotDog(3.50);
        hotDogWithChiliandPepperoni = new FoodItemWithChili(hotDogWithChiliandPepperoni, .30);
        hotDogWithChiliandPepperoni = new FoodItemWithPepperoni(hotDogWithChiliandPepperoni, .40);

        System.out.println("\nPrinting second food item");
        System.out.println(hotDogWithChiliandPepperoni.getName());
        System.out.println(hotDogWithChiliandPepperoni.getPrice());

        Order order = new Order();
        order.addToOrder(hotDogWithChiliandPepperoni);
        order.addToOrder(burgerWithKetchupAndMustard);
        System.out.println("\nPrinting out order:");
        order.printOrder();
        System.out.println(order.getTotalPrice());

        Loyalty loyalty = new Loyalty(1.0, .30);
        System.out.println("\nCustomer with 100% loyalty with a max possible discount of 10 percent");
        System.out.println(loyalty.getDiscountedPrice(order));

    }

}
