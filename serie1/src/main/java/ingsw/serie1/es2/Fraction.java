package ingsw.serie1.es2;

import java.util.Objects;

public class Fraction {

    private long num;
    private long den;

    public Fraction(long num, long den) {
        if(den == 0){
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
        this.num = num;
        this.den = den;
    }

    public static long gcd(long u,long v){
        if(v == 0){
            return u;
        }
        return gcd(v,u % v);
    }

    public static long lcm(long u,long v){
        return (u * v) / gcd(u,v);
    }

    public Fraction simplify(){
        long gcd = gcd(num,den);
        return new Fraction(num/gcd,den/gcd);
    }

    public Fraction sum(Fraction f){
        long den = lcm(this.den,f.den);
        long num = (den / this.den * this.num) + (den / f.den * f.num);
        return new Fraction(num,den);
    }

    public Fraction sub(Fraction f) {
        f.num = - 1 * f.num;
        return this.sum(f);
    }

    public Fraction mul(Fraction f){
        long num = this.num * f.num;
        long dem = this.den * f.den;
        return new Fraction(num,dem);
    }

    public Fraction div(Fraction f){
        if(f.num == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        long num = this.num * f.den;
        long dem = this.den * f.num;
        return new Fraction(num,dem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return num == fraction.num && den == fraction.den;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, den);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }
}
