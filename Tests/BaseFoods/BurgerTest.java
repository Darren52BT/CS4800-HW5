package Tests.BaseFoods;

import Decorator.Food.Burger;
import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithChili;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {

    FoodItem burger;
    @BeforeEach
    void setUp() {
        burger = new Burger(8.50);
        burger = new FoodItemWithChili(burger, .50);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(9, burger.getPrice() );
    }

    @Test
    void getName() {
        assertEquals( "Burger with Chili,", burger.getName());
    }

    @Test
    void getToppings() {
        String[] expectedToppings = {"Chili"};
        assertArrayEquals(expectedToppings, burger.getToppings().toArray());
    }
}