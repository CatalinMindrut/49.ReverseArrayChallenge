package com.Catalin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Write a method called reverse() with an int array as a parameter.
//        The method should not return any value. In other words, the method is allowed to modify the
//        array parameter.
//        In main() test the reverse() method and print the array both reversed and non-reversed
//        To reverse the array, you have to swap the elements, so that the first element is swapped with
//        the last element and so on.
//        For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.
        int[] array = {1,5,3,7,11,9,15};

        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array){

        int maxIndex = array.length -1;
        int halfLength = array.length /2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex -i] = temp;
        }



//        int maxIndex = array.length -1; // 5-1 = 4
//        int halfLength = array.length /2; // 4/2 = 2
//        for(int i=0; i<halfLength; i++){
//            int temp = array[i];
//            // temp = array[0]
//            // array[4] = array [1]
//            // array[3] = array [2]
//            // array[2] = array [3]
//            // array[1] = array [4]
//
//            array[i] = array[maxIndex -i];
//            // array[0] = array[4 - 0]
//            //array[0] = array[4]
//
//            // array[1] = array[4-1]
//            //array[1] = array[3]
//
//            // array[2] = array[4-2]
//            //array[2] = array[2]
//
//            // array[3] = array[4-3]
//            //array[3] = array[1]
//
//            // array[4] = array[4-4]
//            //array[4] = array[0]
//
//            array[maxIndex -i] = temp;
//            //array[4] = temp;
//            //array[3] = temp;
//            //array[2] = temp;
//            //array[1] = temp;
//            //array[0] = temp;
//        }

    }
}
