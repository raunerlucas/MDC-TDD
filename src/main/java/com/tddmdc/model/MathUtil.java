package com.tddmdc.model;


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

        // Propriedade 5
        if (a % b != 0)
            return 1;
        return -1;
    }
}
