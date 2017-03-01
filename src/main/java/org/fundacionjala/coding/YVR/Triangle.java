package org.fundacionjala.coding.YVR;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 */
public class Triangle {
    private int a,b,c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isTriangle() {
        return ((Math.abs(a - c) < b) && (b < (a + c)));
    }
}
