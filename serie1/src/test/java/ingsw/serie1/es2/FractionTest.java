package ingsw.serie1.es2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    Fraction f1,f2;

    @Before
    public void setUp(){
        f1 = new Fraction(2,3);
        f2 = new Fraction(1,2);
    }

    @Test
    public void testGcd(){
        assertEquals(5,Fraction.gcd(5,0));
        assertEquals(Fraction.gcd(2,3),Fraction.gcd(3,2));
        assertEquals(3,Fraction.gcd(3,6));
    }

    @Test
    public void testLcm(){
        assertEquals(0,Fraction.lcm(0,2));
        assertEquals(Fraction.lcm(2,3),Fraction.lcm(3,2));
        assertEquals(6,Fraction.lcm(2,3));
    }

    @Test
    public void testEquals(){
        assertEquals(f1,new Fraction(2,3));
        assertEquals(f2,new Fraction(1,2));
        assertFalse(f1.equals(f2));
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
        Fraction zero = new Fraction(0,4);
        assertThrows(ArithmeticException.class,() -> f1.div(zero));
    }

    @Test
    public void testDiv(){
        assertEquals(new Fraction(4,3),f1.div(f2));
    }
}
