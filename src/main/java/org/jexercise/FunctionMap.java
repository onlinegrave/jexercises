package org.jexercise;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionMap<T, R> {
    public Map<String, Function<T, R>> functionMap;

    public FunctionMap() {
        this.functionMap = new HashMap<>();
    }

    public void addFunction(String name, Function<T, R> function) {
        functionMap.put(name, function);
    }

    public Function<T, R> getFunction(String name) {
        if (functionMap.containsKey(name)) {
            return functionMap.get(name);
        }
        throw new IllegalFunctionNameException(name);
    }

    public static class IllegalFunctionNameException extends RuntimeException {
        public IllegalFunctionNameException(String msg) {
            super("Function not found: ".concat(msg));
        }
    }
}
