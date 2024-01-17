package Home;

import java.sql.SQLOutput;

public class Swap {
    public static void main(String[] args) {
        String X= "Water";
        String Y = "Acid";
        String temp;  // OR String temp = null

        temp = X;
        X = Y;
        Y = temp;

        System.out.println("X : "+X);
        System.out.println("Y : "+Y);
    }
}

/*
Swapping to variable.
Before --> X = Water , Y = Acid
After --> X= Acid  , Y = Water
*/
