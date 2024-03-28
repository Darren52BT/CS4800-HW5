package Tests.Loyalty;

import Decorator.Food.*;
import Decorator.Loyalty.Loyalty;
import Decorator.Order.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyaltyTest {

    Loyalty loyalty;
    Order order;

    @BeforeEach
    void setUp() {
        loyalty = new Loyalty(.5, .2);
        order = new Order();

        FoodItem burger = new Burger(5.0);
        burger = new FoodItemWithChili(burger, 2.0);
        burger = new FoodItemWithKetchup(burger, 1.0);

        FoodItem pizza = new Pizza(25.0);
        pizza = new FoodItemWithPepperoni(pizza, 2.0);

        order.addToOrder(burger);
        order.addToOrder(pizza);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Get Discounted Price with Original being $35, loyaltyStatus % = 50%, maxDiscount % = 20% ")
    void getDiscountedPrice() {
        assertEquals(31.5, loyalty.getDiscountedPrice(order));
    }
}