package org.unicalc;

public class UniCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(float a, float b) {
        return Math.round(a + b);
    }
    public int div(int a, int b) throws IllegalArgumentException {
        if (b == 0)
            throw new IllegalArgumentException();
        return a / b;
    }

    public int div(float a, float b) throws IllegalArgumentException {
        if (b == 0)
            throw new IllegalArgumentException();
        return Math.round(a / b);
    }
}

