package org.jexercise.utils;

import java.util.function.Function;

public class MathUtils {
    public static Function<Integer, Integer> square() {
        return value -> value * value;
    }

    public static Function<Integer, Integer> increment(int number) {
        return value -> value + number;
    }

    public static Function<Integer, Integer> increment() {
        return value -> value + 1;
    }

    public static Function<Integer, Integer> decrement() {
        return value -> value - 1;
    }

    public static Function<Integer, Integer> decrement(int number) {
        return value -> value - number;
    }

    public static Function<Integer, Integer> sigNum() {
        return value -> value > 0 ? 1 : value < 0 ? -1 : 0;
    }

    public static Function<Integer, Integer> abs() {
        return Math::abs;
    }
}
