package lv.acodemy;

public class HomeWork {
    public static void main(String[] args) {

        //Age Category Determiner: Prompt the user to enter their age, and then use an if statement
        // to categorize them as a child, teenager, adult, or senior citizen.

        int age = 55;
        if (age >= 0 && age < 12) {
            System.out.println("You are a child");
        } else if (age >= 12 && age < 18) {
            System.out.println("You are teen");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are adult");
        }
        if (age >= 60) {
            System.out.println("You are senior");
        }

        //Write a program that accepts a number (1-7) as input and uses if-else statements to determine the
        // corresponding day of the week (e.g., 1 is Sunday, 2 is Monday, etc.).

//        int day = 1;
//        if (day = 1) {
//            System.out.println("1 is Sunday");
//        } else if (day = 2) {
//            System.out.println("2 is Monday");
//        } else if (day = 3) {
//            System.out.println("3 is Tuesday");
//        } else if (day =4) {
//            System.out.println("4 is Wednesday");
//        } else if (day = 5) {
//            System.out.println("5 is Thursday");
//        } else if (day = 6) {
//            System.out.println("6 is Friay");
//        } else if (day = 7){
//            System.out.println("7 is Saturday");
//        } else {
//            System.out.println("Enough");
//        }

//        int[] dayWeek = {1, 2, 3, 4, 5, 6, 7};
//        if(dayWeek == 0) {
//            System.out.println("1 is Sunday");
//        }

//        int[] emptyArray = new int[7];
//        System.out.println(Arrays.toString(emptyArray));
//
//        emptyArray[0] = 1;
//        emptyArray[1] = 2;
//        emptyArray[2] = 3;
//        emptyArray[3] = 4;
//        emptyArray[4] = 5;
//        emptyArray[5] = 6;
//        emptyArray[6] = 7;
//        System.out.println(Arrays.toString(emptyArray));

        //Number Range Checker: Build a program that checks if a given number falls within a
        // specified range (e.g., between 1 and 100) using if-else statements.

        int numb = 100;
        if (numb >= 1 && numb <= 100) {
            System.out.println("Correct number");
        } else if (numb <= 0 && numb >= 101) {
            System.out.println("Incorrect number");
        }
        // не могу понять почему при ввозде неправильного числа такое как 0 или 101 ничего он не пишет.


    }
}
