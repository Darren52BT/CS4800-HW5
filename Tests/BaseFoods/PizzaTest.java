package Tests.BaseFoods;

import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithPepperoni;
import Decorator.Food.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    FoodItem pizza;
    @BeforeEach
    void setUp() {
        pizza = new Pizza(18.00);
        pizza = new FoodItemWithPepperoni(pizza, 2.00);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(20.00, pizza.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Pizza with Pepperoni,", pizza.getName());
    }

    @Test
    void getToppings() {
        String [] expectedToppings = {"Pepperoni"};
        assertArrayEquals(expectedToppings, pizza.getToppings().toArray());
    }
}