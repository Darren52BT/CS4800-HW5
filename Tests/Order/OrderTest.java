package Tests.Order;

import Decorator.Food.*;
import Decorator.Order.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        order = new Order();
        FoodItem burger = new Burger(5.0);
        burger = new FoodItemWithChili(burger, 2.0);
        burger = new FoodItemWithKetchup(burger, 1.0);

        FoodItem pizza = new Pizza(25.0);
        pizza = new FoodItemWithPepperoni(pizza, 2.0);

        order.addToOrder(burger);
        order.addToOrder(pizza);

        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToOrder() {
        order.addToOrder(new HotDog(2.0));


        String expectedOutput = "Burger with Chili,Ketchup,Pizza with Pepperoni,Hot Dog";
        order.printOrder();

        String actualContent = outContent.toString().replace("\n", "").replace("\r", "");

       assertEquals(expectedOutput, actualContent);



    }

    @Test
    void printOrder() {
        String expectedOutput = "Burger with Chili,Ketchup,Pizza with Pepperoni,";
        order.printOrder();
        String actualContent = outContent.toString().replace("\n", "").replace("\r", "");
        assertEquals(expectedOutput, actualContent);

    }

    @Test
    void getTotalPrice() {

        assertEquals(35.0, order.getTotalPrice());
    }
}