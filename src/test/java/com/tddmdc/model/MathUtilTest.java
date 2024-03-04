package com.tddmdc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import  static com.tddmdc.model.MathUtil.*;
class MathUtilTest {

    @Test
    void mdcParP1() {
        Integer a = 8, b = 4, esp = 4, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcImparP1() {
        final Integer a = 9, b = 3, esp = 3, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcMaxValP1() {
        final Integer a = Integer.MAX_VALUE, b = Integer.MIN_VALUE + 1,
                esp = Math.abs(Integer.MIN_VALUE + 1),
                obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcParP2() {
        final Integer a = 16, b = 8, div = 4, obt = MathUtil.mdc(a, b);
//        assertEquals(0, obt % div);
        assertTrue(obt % div == 0);
    }

    @Test
    void mdcNegativo_AP2() {
        final Integer a = -30, b = 0, esp = 30, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcNegativo_BP2() {
        final Integer a = 0, b = -40, esp = 40, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcNegativo_ALlP2() {
        final Integer a = -80, b = -40, esp = 40, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcZeroInBP3() {
        final Integer a = 3, b = 0, esp = 3, obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }

    @Test
    void mdcZeroInAP3() {
        final Integer a = 0, b = 3, esp = 3, obt = MathUtil.mdc(a, b);
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

    @Test
    void mdcP5() {
        // se mdc(a,b) == 1, então mdc(a*b,c) == mdc(b,c)
        final Integer a = 7, b = 3, c = 5, esp = mdc(a*b,c), obt = mdc(b,c);
        assertEquals(esp,obt);
    }
    @Test
    void mdcCom1P5() {
        // se mdc(a,b) == 1, então mdc(a*b,c) == mdc(b,c)
        final Integer a = 7, b = 3, c = 5, esp = 1, obt = mdc(b,c);
        assertEquals(esp,obt);
    }

    @Test
    void mdcA_BbyB_AP6() {
        final Integer a = 4, b = 2, esp = MathUtil.mdc(b, a), obt = MathUtil.mdc(a, b);
        assertEquals(esp, obt);
    }


}