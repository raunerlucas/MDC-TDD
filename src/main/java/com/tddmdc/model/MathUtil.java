package com.tddmdc.model;


import java.util.Objects;

public class MathUtil {
    public static Integer mdc(Integer a, Integer b) {
        // preparando para fazer funções
        a = Math.abs(a);
        b = Math.abs(b);
        Integer m = Integer.max(a, b);
        b = Integer.min(a, b);
        a = m;

        // Propriedade 1
        if (b > 0 && a % b == 0)
            return b;

        // Propriedade 3
        if (b == 0)
            return a;

        return mdc(a - b, b);
    }

    public static Integer mdc(Integer... valores) {
        Objects.requireNonNull(valores, "NULL foi passado como parametro.");

        if (valores.length == 0)
            throw new IllegalArgumentException("Nenhum valor foi passado como parametro.");

        Integer a = valores[0];
        for (Integer b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
}
