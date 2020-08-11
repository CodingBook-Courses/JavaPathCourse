package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[][] myIntArray = {
                {1, 2, 3},
                {3},
                {3,4,6,7,7},
                {3,2}
        };
	   for(int i = 0; i < myIntArray.length; i++) {
           System.out.println(Arrays.toString(myIntArray[i]));
       }

    }
}
