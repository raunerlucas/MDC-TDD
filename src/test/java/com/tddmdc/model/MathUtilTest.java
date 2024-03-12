package com.tddmdc.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static com.tddmdc.model.MathUtil.mdc;

class MathUtilTest {

    @ParameterizedTest
    @CsvSource({
            "9,3,3",
            "4,2,2",
            "8,4,4",
            "7,3,1"
    })
    void mdcP1(final Integer a, final Integer b, final Integer esp) {
        assertEquals(esp, mdc(a, b));
    }

   @Test
    void mdcP2() {
        final Integer a = 16, b = 8, div = 4, obt = MathUtil.mdc(a, b);
//        assertEquals(0, obt % div);
        assertTrue(obt % div == 0);
    }


    @ParameterizedTest
    @CsvSource({
            "-30,0,30",
            "0,-40,40",
            "40,20,20",
            "-80,-40,40"
    })
    void mdcP2Negativo(final Integer a, final Integer b, final Integer esp) {
        assertEquals(esp, MathUtil.mdc(a, b));
    }

    @Test
    void mdcP3() {
        final Integer a = 3, b = 0, esp = 3, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }


    @Test
    void mdcM_ParP4() {
        final Integer a = 9, b = 3, m = 2,
                esp = MathUtil.mdc(a * m, b * m), obt = m * MathUtil.mdc(a, b);
        // mdc(a*m,b*m) == m * mdc(a,b)
        // mdc( 18, 6 ) == 2 * mdc(9,3)
        // 6 == 2 * 3
        assertEquals(esp, obt);
    }

    @ParameterizedTest
    @CsvSource({
            "7,3,5",// numero que o minimo divisor comum é 1
            "5,3,7",

    })
    void mdcP5(final Integer a, final Integer b, final Integer c) {
        // se mdc(a,b) == 1, então mdc(a*b,c) == mdc(b,c)
        final Integer esp = mdc(a * b, c), obt = mdc(b, c);
        assertEquals(esp, obt);
    }

    @Test
    void mdcCom1P5() {
        // se mdc(a,b) == 1, então mdc(a*b,c) == mdc(b,c)
        final Integer a = 7, b = 3, c = 5, esp = 1, obt = mdc(b, c);
        assertEquals(esp, obt);
    }

    @ParameterizedTest
    @CsvSource({
            "4,2",
            "8,4",
            "7,3"
    })
    void mdcP6(final Integer a,final Integer b) {
        final Integer esp = mdc(b, a), obt = mdc(a, b);
        assertEquals(esp, obt);
    }


}