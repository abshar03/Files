package com.abshar.test;

/**
 * Created by abshar on 12/29/2018.
 */
public class DecisionStructures {
    public static void main(String[] args) {
        int x =13;
        int y = 12;
        int z = 13;
      //  boolean expression = ((x==y) && (x>z));
      //  boolean expression = ((x==y) || (x>z));
     //   boolean expression = ((x==y) && (x<z));
        boolean expression = !((x==y) || (x==z));
        System.out.println(expression);
    }
}
