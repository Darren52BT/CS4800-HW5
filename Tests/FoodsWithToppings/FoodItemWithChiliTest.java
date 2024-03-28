package Tests.FoodsWithToppings;

import Decorator.Food.Burger;
import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithChili;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemWithChiliTest {

    FoodItem food;
    @BeforeEach
    void setUp() {
        food = new Burger(5.0);
        food = new FoodItemWithChili(food, 10.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(15.0, food.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Burger with Chili,", food.getName());
    }

    @Test
    void getToppings() {
        String [] expectedToppings = {"Chili"};
        assertArrayEquals(expectedToppings, food.getToppings().toArray());
    }
}