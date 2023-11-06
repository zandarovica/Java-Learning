package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {7, 3, 4, 21, 17, 11};
        //first number = 7 -> [0] index

        int myNumber = numbers[4];
        System.out.println(myNumber);

        //determine size of array
        System.out.println(numbers.length);

        //change number in array
        numbers[5] = 34;
        System.out.println(Arrays.toString(numbers));

        int[] emptyArray = new int[7];
        System.out.println(Arrays.toString(emptyArray));

        //update emty array with numbers
        emptyArray[0] = 6;
        emptyArray[3] = 3;
        emptyArray[4] = 15;
        emptyArray[6] = 55;
        System.out.println(Arrays.toString(emptyArray));

        //string [] array
        String[] fruitBasket = {"apples", "banana", "kiwi", "pear", "pineapple"};
        //first fruit = apples -> [0] index

        String fruit = fruitBasket[3];
        System.out.println(fruit);
        System.out.println(fruitBasket[3]);

        //Logic in Java
        /*
        condition = true/false
        5>2 = true

        if(condition) {
        //execute this code block
        }

        if(5<2) {
        //this code block will be executed in case of condition = true
        }
         */

        if (10 > 5) {
            System.out.println("This statement is true!");
        }

        if (10 < 9) {
            System.out.println("This statement is also true!");
        }

        if (fruitBasket[0].equals("apples")) {
            System.out.println("Yes, you find apples");
        }

        //if-else
        boolean isSummer = true;

        if (isSummer) {
            System.out.println("We will lay on a beach!");
        } else {
            System.out.println("We will watch Netflix series!");
        }

        //String light = "RED";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();

        if (light.equals("GREEN")) {
            System.out.println("You can go!");
        } else if (light.equals("YELLOW")) {
            System.out.println("Don't go, please wait for Green light");
        } else if (light.equals("RED")) {
            System.out.println("Don't go!");
        } else {
            System.out.println("Traffic light is not working!");
        }

    }
}
