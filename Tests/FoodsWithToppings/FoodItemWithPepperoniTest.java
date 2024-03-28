package Tests.FoodsWithToppings;

import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithPepperoni;
import Decorator.Food.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemWithPepperoniTest {

    FoodItem food;
    @BeforeEach
    void setUp() {
        food = new Pizza(25.0);
        food = new FoodItemWithPepperoni(food,5.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(30, food.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Pizza with Pepperoni,", food.getName());
    }

    @Test
    void getToppings() {
        String[] expectedToppings = {"Pepperoni"};
        assertArrayEquals(expectedToppings, food.getToppings().toArray());
    }
}