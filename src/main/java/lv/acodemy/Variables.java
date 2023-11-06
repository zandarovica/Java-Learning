package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        // int (number)
        int myCurrentAge = 28;
        System.out.println(myCurrentAge);

        /*
        This is
        multi line
        comment approach
        TODO: Delete it later
         */

        byte myWeight = 65; // byte data type
        short salary = 2500; // short data type
        char myFirstLetterOfName = 'D'; // character data type
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI; // PI number
        float randomNumber = 4567.127698F; // floating number
        double classicFloatingNumber = 5677381.56778901246677; // floating number

        // Boolean true/false is, has
        // Example: isSummer, isAdult, hasEnoughAge, hasValue;
        boolean isSummer = false;
        boolean isAutumn = true;

        // Exercise 1.
        // Create 2 variables for each data type
        // Variable should be meaningful as it possible
        // Variable name should contain at least 2 worlds
        // Print all the variable values
        // Lower camel case


        int myCurrentStage = 8;
        System.out.println(myCurrentStage);

        byte lashLineInBox = 20;
        System.out.println(lashLineInBox);

        short numberOfLashes = 6000;
        System.out.println(numberOfLashes);

        char nameOfCompany = 'D';
        System.out.println(nameOfCompany);

        long allMyClient = 67889;
        System.out.println(allMyClient);


        int x, y, z;
        x = 10;
        y = 4;
        z = 8;
        int summa = x + y + z;
        System.out.println(summa);

        int summanExample = 10 + 5 + 2 + x + y + z;
        System.out.println(summanExample);

        // 2a(a + b); result?
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        // 2 * 4 ( 4 + 3);

        int remainder = 10 % 3;
        System.out.println(remainder);


        // String (non-primitive)

        String firstName = "Darja";
        String lastName = "Žandaroviča";
        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);

        System.out.println("My full name is " + firstName + " " + lastName);
        System.out.printf("My full name is %s %s\n", firstName, lastName);
        System.out.println("Hello world");

        String mySchool = "EEC";
        System.out.println("Now I am currently teaching in: " + mySchool + ".");
        System.out.printf("Now I am currently teaching in: %s.\n", mySchool);

        String fullSentence = firstName + " " + lastName + "." + "I am" + " " + myCurrentAge + " " + "years old";
        System.out.println(fullSentence);

        // Exercise 2
        // Create two-three String variables
        // Combine (concatinate)
        // Print result out
        // Example: Today is Monday. Soon I will go home


    }
}
