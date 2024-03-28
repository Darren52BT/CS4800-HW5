package Tests.BaseFoods;

import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemWithChili;
import Decorator.Food.FoodItemWithKetchup;
import Decorator.Food.HotDog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotDogTest {

    FoodItem hotdog;
    @BeforeEach
    void setUp() {
        hotdog = new HotDog(3.5);
        hotdog = new FoodItemWithChili(hotdog, .5);
        hotdog = new FoodItemWithKetchup(hotdog, .2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(4.2, hotdog.getPrice());
    }

    @Test
    void getName() {
        assertEquals("Hot Dog with Chili,Ketchup,", hotdog.getName());
    }

    @Test
    void getToppings() {
        String[] expectedToppings = {"Chili", "Ketchup"};
        assertArrayEquals(expectedToppings, hotdog.getToppings().toArray());
    }
}