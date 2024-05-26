public class Curs04 {
    public static void main(String[] args) {
/**Challenge 1.Write a Java program where you create two string objects named StringOne and StringTwo with the same value "OpenAI
 * Check and print whether they refer to the same object"*/

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println(stringTwo);
        System.out.println(stringOne);

/**Challenge 2.Write a Java program to declare two integer variables firstNumber and  secondNumber with any values.
 * Use an equality operator to compare these two numbers and print the result. Do the same for two String objects
 * firstString and secondString with the same value, but use the .equals() method for comparison. Print the result*/

        int firstNumber = 10;
        int secondNumber = 12;
        System.out.println(firstNumber == secondNumber);

        String firstString = "Capsuna";
        String secondString = "Capsuna";
        if (firstString.equals(secondString)) {
            System.out.println("Valorile sunt egale");
        } else {
            System.out.println("Valorile nu sunt egale");
        }

        /**Challenge 3.Write a Java program that declares an integer variable age with a value of 20. Print a statement saying
         * "I'm an adult" if age is 18 or more, else print "Im not an adult" */

        int age = 20;
        if (age >= 18) {
            System.out.println("I`m an adult!");
        } else {
            System.out.println("I`m not an adult!");
        }
/**Challenge 4.Write a Java program where you declare two integer variables heightOne and heightTwo with any values
 * Use a ternary operator to determine the greater height and assign it to a variable maximumHeight.Print the result */

        int HeightOne = 12;
        int HeightTwo = 25;
        int maxHeight = (HeightOne > HeightTwo) ? (HeightOne) : (HeightTwo);
        System.out.println("The maxim height is " + maxHeight);

/**Challenge 5.Write a Java program to print the numbers from 1 to 10 using a for loop. As next step, modify your
 * program to print only the even numbers from 1 to 10. */


        for (int a = 1; a < 11; ++a) {
            System.out.println("The numbers are: " + a);
        }
        /**Even numbers only*/

        for (int a = 1; a < 11; ++a) {
            if (a % 2 == 0) {
                System.out.println("The even numbers are:" + a);
            }
        }
/**Challenge 6.Write a Java program where you declare an integer variable temperature. Assign a value to it and print "hot"
 * if the temperature is more than 30, "Warm" if the temperature is between 20 and 30 and cold if it`s less than 20.*/

        int temperature = 31;
        if (temperature > 30) {
            System.out.println("The temperature is HOT");
        } else if (20 <= temperature && temperature <= 30) {
            System.out.println("The temperature is WARM");
        } else {
            System.out.println("The temperature is COLD");
        }

/**Challenge 7.Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne,
 * sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether
 * is equilateral, "isosceles" or Scalene*/

/**Challenge 8.Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable
 * number and assign a value to it. Then calculate and print the factorial of number.*/

/**Challenge 9.Write a Java program to create two String variables, countryOne with the value USA and countryTwo with
 * the value USA. Check if countryOne and countryTwo are equal using the equal() method and print the result.
 * Then change the value of countryTwo to UK and check for equality again. Print the result.*/

        String countryOne = "USA";
        String countryTwo = "USA";
        if (countryOne.equals(countryTwo)) {
            System.out.println("The countryOne is equal to countryTwo");
        } else {
            System.out.println("The countries are not equal");
        }

        /**Varianta 2 cu UK*/
        String countryOne1 = "USA";
        String countryTwo2 = "UK";
        if (countryOne1.equals(countryTwo2)) {
            System.out.println("The countryOne1 is equal to countryTwo2");
        } else {
            System.out.println("The countries are not equal");
        }

/**Challenge 10.Write a Java program that creates two distinct ArrayList objects, listOne listTwo. Add some elements
 * to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe
 * output.*/


/**Challenge 11. Write a Java program where you declare four integer variables: a,b,c,d. Assign them values of 10,20,30
 *  and 40 respectively. Create two more variables additionResult and multiplicationResult. Set additionResult to the sum
 *  of a and b and multiplicationResult to the product of c and d. Print the values of additionResult and multiplicationResult */

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int additionResult = a + b;
        int multiplicationResult = c * d;
        System.out.println("The sum is: " + additionResult);
        System.out.println("The product is: " + multiplicationResult);

/**Challenge 12. Write a Java program where you declare an integer variable number with a value of 25. Use unary minus operator
 * to change the sign of number and assign it to a variable negativeNumber. Print the values of number and negativeNumber.*/

        int number = 25;
        int negativeNumber = -number;
        System.out.println("the number is: " + number);
        System.out.println("the negativeNumber is: " + negativeNumber);

/**Challenge 13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true
 * and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values */

        boolean isRaining = true;
        boolean isSunny = false;
        boolean isRainy = !isRaining;
        boolean isSun = !isSunny;
        System.out.println("The values are: " + isRaining + " and " + isSunny);
        System.out.println("The new values are: " + isRainy + " and " + isSun);

/**Challenge 14.Write a Java program where you declare an integer variable counter with the value of 0 zero. Use the
 * increment operator to increase the value of counter by 1 and then print the value. After that, use the decrement
 * operator to decrease the value of counter by 1 and then print the value. */

        int bb = 0;
        System.out.println("The number increment is: " + ++bb);
        System.out.println("The number is: " + bb);
        System.out.println("The number decrement is: " + --bb);


/**Challenge 15.Write a Java program where you declare an integer variable total with a value of 100. Use the compound
 * assigment operator to decrease the total by 20 and then print the value. Next, use another compound assigment operator
 * to multiply the total by 2 and then print the value*/

        int numb = 100;
        numb -= 20;
        System.out.println(numb);
        numb *= 2;
        System.out.println(numb);


/**Challenge 16.Write a java program where you use unary operators to perform a series of transformations on an integer
 * variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1.
 * Print the result at each step*/

        int numar = 50;

        int numarNegativ = -numar;
        System.out.println("the negate number is: " + numarNegativ);

        int absoluteValue = Math.abs(numarNegativ);
        System.out.println("Absolute value: " + absoluteValue);

        int incrementare = absoluteValue + 1;
        System.out.println("The increment operations is: " + incrementare);

/**Challenge 17.Curs 04 -  Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername
 * and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions
 * - if both has Username and hasPassword are true, print "Authentication successful"
 * - if either hasUsername or hasPassword is false print "Authentication failed"
 * - if hasUsername is true but hasPassword is false print Password incorrect*/

        /**Scanner scanner = new Scanner(System.in);
         System.out.println("Insert the boolean values:");
         int firstB = scanner.nextInt();
         int secondB = scanner.nextInt();*/
        boolean hasUsername = false;
        boolean hasPassword = false;
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password incorect");
        } else if (hasUsername || hasPassword) {
                System.out.println("Authentication failed");
        } else {
            System.out.println("Username incorect");
        }
/**Challenge 18.Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize
 * the array such that each element is equal to its index increments by 1. Then use another for loop to decrement each element
 * by 1. Print the array before and after the decrement operation using a for-each loop*/


/**Challenge 19.Write aJava program that takes an integer variable age as input. Use a ternary operator to classify
 * the person into one of the following categories"Child: age<12","Teenager 12<age<17", 18>"Adult"<64 and senior
 * >=64. Print the result classification*/

        int ageP = 12;
        String ternaryClassification = (ageP <= 12) ? "Child" :
                (ageP > 12 && ageP < 18) ? "Teenager " :
                        (age >= 18 && ageP < 64) ? "Adult" : "Senior";
        System.out.println("Classification: " + ternaryClassification);


/**Challenge 20. Write a Java program that takes three integer variables a,b, and c as input. Use nested ternary operators
 * to find and print the largest number among the three*/

        int a1 = -12;
        int b1 = -25;
        int c1 = -2;
        int largestNumber = (a1 > b1) ? ((a1 > c1) ? a1 : c1) : ((b1 > c1) ? b1 : c1);
        System.out.println("The largest number is " + largestNumber);

/**Challenge 21. Write a Java program that takes a double variable score representing a student’s score on a test.
 * Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
 A: 90-100
 B: 80-89
 C: 70-79
 D: 60-69
 F: 0-59
 Print the resulting letter grade.*/

        double score = 101;
        char grade = (score >= 90) ? 'A'
                : (score >= 80) ? 'B'
                : (score >= 70) ? 'C'
                : (score >= 60) ? 'D'
                : 'F';
        System.out.println("Student`s score test is: " + grade);
    }
}
