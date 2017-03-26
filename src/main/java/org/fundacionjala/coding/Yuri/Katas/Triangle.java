package org.fundacionjala.coding.Yuri.Katas;

/**
 * Created by Win7-VM-01 on 28/02/2017.
 * Description:
 Implement a method that accepts 3 integer values a, b, c. The method should return true if a triangle can be built
 with the sides of given length and false in any other case.
 */
public class Triangle {
    private final int a, b, c;
    /**
     * this a constructor method for the triangle class.
     * @param a this is side of the triangle.
     * @param b this is side of the triangle.
     * @param c this is side of the triangle.
     */
    public Triangle(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * this method helps to verify if the 3 sides  belongs to triangle.
     * @return <code>true</code> if the three first values are valid for a triangle.
     *         <code>false</code> if the some side is not valid.
     */
    public boolean isTriangle() {
        return ((Math.abs(a - c) < b) && (b < (a + c)));
    }
}
