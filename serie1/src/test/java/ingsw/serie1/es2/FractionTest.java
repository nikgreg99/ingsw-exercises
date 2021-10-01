package ingsw.serie1.es2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FractionTest {

    Fraction f1,f2;

    @Before
    public void setUp(){
        f1 = new Fraction(2,3);
        f2 = new Fraction(1,2);
    }

    @Test
    public void testZeroDen(){
        assertThrows(IllegalArgumentException.class,()-> new Fraction(1,0));
    }

    @Test
    public void testSimplify(){
        Fraction fraction = new Fraction(2,4);
        assertEquals(new Fraction(1,2),fraction.simplify());
    }

    @Test
    public void testAdd(){
        assertEquals(new Fraction(7,6),f1.sum(f2));
    }

    @Test
    public void testSub(){
        assertEquals(new Fraction(1,6),f1.sub(f2));
    }

    @Test
    public void testMul(){
        assertEquals(new Fraction(2,6),f1.mul(f2));
    }

    @Test
    public void testDivByZero(){
        Fraction zeroFraction = new Fraction(0,4);
        assertThrows(ArithmeticException.class,() -> f1.div(zeroFraction));
    }

    @Test
    public void testDiv(){
        assertEquals(new Fraction(4,3),f1.div(f2));
    }

}
