package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        //Loop

        //for loop
        /*
        for(counter; condition; counter change) {

        }
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }

        //print numbers 1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //print numbers 10 -0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayOfNames = {"Eduards", "Olivija", "Alona", "Kate", "Alex", "Nick"};

        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
            //arrayOfNames[0]
            //arrayOfName[1]
            //arrayOgName[2]
            //arrayOfName[3]
            //arrayOfName[4]
            //arrayOfName[5]
            //arrayOfName[6] -> Don't go
        }

        //for each
        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        String[] countries = {"United States", "Canada", "United Kingdom", "Germany", "France", "Australia",
                "Japan", "India", "China", "Brazil"};

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("JAMETE KUDASAI");
                break;
            }
            System.out.println(countries[i]);
        }

        //3 numbers array
        int[] firstArray = {1, 2, 3, 4, 5, 7, 4};
        int[] secondArray = {3, 4, 5, 6, 7,};
        int[] thirdArray = {5, 6, 7, 8, 9, 3, 4};

        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfFirstArray);
                    }
                }
            }
        }

        //from 0 to 100
        //print even numbers

        //for -> iterate from 0 to 100
        //if -> if this is even numbers, we print it

        int number = 50;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //while -> do while
        /*
        while(condition) {
        //execute code block;
        }
         */

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //calculate the sum of numbers from 1 to 5 using while loop
        int x = 1;
        int summa = 0;
        while (x <= 5) {
            summa = summa + x;
            x++;
        }
        System.out.println("Summa:" + summa);
        // 1+2+3+4+5=15

        //print even numbers from 0 to 20
        int y = 0;
        while (y <= 20) {
            System.out.print(y + " ");
            y = y + 2;
        }

        /*
        do {
        //execute code black
        } while(condition)
         */

        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);


    }
}
