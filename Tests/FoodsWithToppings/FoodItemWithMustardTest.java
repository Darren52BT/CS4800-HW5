package Tests.FoodsWithToppings;

import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithMustard;
import Decorator.Food.HotDog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemWithMustardTest {
    FoodItem food;

    @BeforeEach
    void setUp() {
        food = new HotDog(5.0);
        food = new FoodItemWithMustard(food, 2.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(7, food.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Hot Dog with Mustard,", food.getName());
    }

    @Test
    void getToppings() {
        String[] expectedToppings = {"Mustard"};
        assertArrayEquals(expectedToppings, food.getToppings().toArray());
    }
}