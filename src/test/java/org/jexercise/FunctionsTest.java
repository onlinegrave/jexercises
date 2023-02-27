package org.jexercise;

import org.junit.jupiter.api.*;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FunctionsTest {
    public FunctionMap<Integer, Integer> functions;

    @BeforeEach
    public void init() {
        this.functions = Functions.initFunctions();
    }

    @Test
    @Order(1)
    void squareFunction() {
        Function<Integer, Integer> squareFunction = functions.getFunction("square");
        int result = squareFunction.apply(5);
        assertEquals(result, 25);
    }

    @Test
    @Order(2)
    void incrementFunction() {
        Function<Integer, Integer> incrementFunction = functions.getFunction("increment");
        int result = incrementFunction.apply(5);
        assertEquals(result, 6);
    }

    @Test
    @Order(3)
    void decrementFunction() {
        Function<Integer, Integer> decrementFunction = functions.getFunction("decrement");
        int result = decrementFunction.apply(5);
        assertEquals(result, 4);
    }

    @Test
    @Order(4)
    void sigNumFunction() {
        Function<Integer, Integer> sigNumFunction = functions.getFunction("signum");
        int result1 = sigNumFunction.apply(100);
        assertEquals(result1, 1);

        int result2 = sigNumFunction.apply(-100);
        assertEquals(result2, -1);

        int result3 = sigNumFunction.apply(0);
        assertEquals(result3, 0);
    }

    @Test
    @Order(5)
    void absFunction() {
        Function<Integer, Integer> squareFunction = functions.getFunction("abs");
        int result1 = squareFunction.apply(-5);
        assertEquals(result1, 5);
        int result2 = squareFunction.apply(100);
        assertEquals(result2, 100);
    }

}
