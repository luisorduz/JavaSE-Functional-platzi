package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

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

        Function<Integer, Boolean> isOdd = x -> x % 2 == 0;
        System.out.println(isOdd.apply(5));

        Predicate<Integer> ispar = x -> x % 2 == 0;
        System.out.println(ispar.test(5)); //false
        System.out.println(ispar.test(6)); // true

        Predicate<Persona> getCalificacion = Persona -> Persona.getCalificacion() >= 5.9;

        Persona persona = new Persona(4);
        System.out.println(getCalificacion.test(persona));

    }

    static class Persona{
        private double calificacion;

        public Persona(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
