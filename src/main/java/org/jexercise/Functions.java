package org.jexercise;

import org.jexercise.utils.MathUtils;

public class Functions {
    private Functions() {
    }

    public static FunctionMap<Integer, Integer> initFunctions() {
        FunctionMap<Integer, Integer> map = new FunctionMap<>();
        map.addFunction("square", MathUtils.square());
        map.addFunction("signum", MathUtils.sigNum());
        map.addFunction("abs", MathUtils.abs());
        map.addFunction("increment", MathUtils.increment());
        map.addFunction("decrement", MathUtils.decrement());
        return map;
    }
}
