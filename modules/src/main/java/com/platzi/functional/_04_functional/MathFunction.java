package com.platzi.functional._04_functional;

import java.util.function.Function;

public class MathFunction {

    public static void main(String[] args) {

        Function<Integer, Integer> functionSquare = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

        System.out.println(functionSquare.apply(4));
        System.out.println(functionSquare.apply(5));
    }
}
