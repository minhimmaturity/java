package com.example;

public class Solution {
    private int numerator;
    private int denominator;

    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return this;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public Solution add(Solution other) {
        numerator = numerator * other.denominator + denominator * other.numerator;
        denominator = denominator * other.denominator;
        return reduce();
    }

    public Solution subtract(Solution other) {
        numerator = numerator * other.denominator - denominator * other.numerator;
        denominator = denominator * other.denominator;
        return reduce();
    }

    public Solution multiply(Solution other) {
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
        return reduce();
    }

    public Solution divide(Solution other) {
        numerator = numerator * other.denominator;
        denominator = denominator * other.numerator;
        return reduce();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Solution other = (Solution) obj;
        return numerator == other.numerator && denominator == other.denominator;
    }
}
