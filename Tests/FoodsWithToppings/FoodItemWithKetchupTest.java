package Tests.FoodsWithToppings;

import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithKetchup;
import Decorator.Food.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemWithKetchupTest {

    FoodItem food;
    @BeforeEach
    void setUp() {
        food = new Pizza(20.0);
        food = new FoodItemWithKetchup(food, 5.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(25.0, food.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Pizza with Ketchup,", food.getName());
    }

    @Test
    void getToppings() {
        String[] expectedToppings = {"Ketchup"};
        assertArrayEquals(expectedToppings, food.getToppings().toArray());
    }
}