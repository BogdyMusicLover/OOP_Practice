package org.example.package1;

public class Class1 {

   public int x;
    public static int Y = 2;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int getY() {
        return Y;
    }

    public static void setY(int y) {
        Y = y;
    }

    public void testMethod(){
        int z = Y;
        while (z < 5) {
            z++;
        }
        System.out.println(z);

    }
}
