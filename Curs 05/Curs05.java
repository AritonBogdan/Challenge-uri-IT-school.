import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Curs05 {
    public static void main(String[] args) {

/**Challenge 1.Even or Odd Checker
 Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd"*/

//        int a = 4;
//        if (a % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

/**Challenge 2.Month Name Finder
 Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or
 "Invalid Month" if out of range.*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert a number between 1 and 12: ");
//        double numberInserted = scanner.nextInt();
//        switch ((int) numberInserted) {
//            case 1:
//                System.out.println("Ianuarie");
//                break;
//            case 2:
//                System.out.println("Ferbuarie");
//                break;
//            case 3:
//                System.out.println("Martie");
//                break;
//            case 4:
//                System.out.println("Aprilie");
//                break;
//            case 5:
//                System.out.println("Mai");
//                break;
//            case 6:
//                System.out.println("Iunie");
//                break;
//            case 7:
//                System.out.println("Iulie");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("Septembrie");
//                break;
//            case 10:
//                System.out.println("Octombrie");
//                break;
//            case 11:
//                System.out.println("Noiembrie");
//                break;
//            case 12:
//                System.out.println("Decembrie");
//                break;
//            default:
//                System.out.println("Luna invalida");
//                break;
//        }

/**Challenge 3.Counting Negative Numbers
 Given an array of integers, write a program to count and print the number of negative integers in the array.*/

//        int[] numbers = {2, -5, 8, 7, -6, -6, -1, 10, -5};
//        int count = 0;
//        for (int num : numbers) {
//            if (num < 0) {
//                count++;
//            }
//        }
//        System.out.println("There are " + count + " negative numbers");


/**Challenge 4.String Reverser
 Ask the user to enter a string. Print the reversed version of this string.*/

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter a string value: ");
//
//        String userInput = scanner1.nextLine();
//        String reverseInput = " ";
//
//        for (int i = userInput.length() - 1; i >= 0; i--) {
//            reverseInput += userInput.charAt(i);
//        }
//        System.out.println("Reverse string is: " + reverseInput);

/** Challenge 5.Fibonacci Series Generator
 Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.*/

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("Enter the number of Fibonacci numbers to generate: ");
//        int n = scanner2.nextInt();
//        // Check if the input is valid
//        if (n <= 0) {
//            System.out.println("Please enter a positive integer greater than 0.");
//            return;
//        }
//
//        // Generate and print the Fibonacci series
//        int first = 0, second = 1;
//        System.out.println("The first " + n + " Fibonacci numbers are:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(first + " ");
//            int next = first + second;
//            first = second;
//            second = next;
//        }

/**Challenge 6. While Loop
 Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1.
 After they enter -1, print the sum of all numbers entered (excluding -1).*/

//        Scanner scanner3 = new Scanner(System.in);
//
//        int sum = 0;
//        int number;
//
//        System.out.println("Insert a number or -1 to stop: ");
//
//        do {
//            System.out.println("Enter a number: ");
//            number = scanner3.nextInt();
//
//            if (number != -1) {
//                sum += number;
//            }
//        } while (number != -1);
//        System.out.println(sum);

/**Challenge 7. Do-While Loop
 Create a program where the user is prompted to guess a predefined number.
 After each guess, the program should inform the user if the guess is too high or too low. The program should keep
 prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.*/

//        int predifenedNumber = 10;
//        Scanner scanner4 = new Scanner(System.in);
//        int guess;
//        do {
//            System.out.println("Guess the number ");
//            guess = scanner4.nextInt();
//            if (guess > predifenedNumber ) {
//                System.out.println("Too high, try again!");
//            }else if(guess < predifenedNumber){
//                System.out.println("Too low, try again!");
//            }else{
//                System.out.println("Congratulation! You guess it!");
//            }
//        }while (guess != predifenedNumber);

/**Challenge 8. For Loop
 Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.*/

//        int n2 = 10;
//        // Check if the input is valid
//        if (n2 <= 0) {
//            return;
//        }
//        // Generate and print the Fibonacci series
//        int primul = 0, alDoilea = 1;
//        System.out.println("The first " + n2 + " Fibonacci numbers are:");
//        for (int i1 = 0; i1 < n2; i1++) {
//            System.out.print(primul + " ");
//            int next2 = primul + alDoilea;
//            primul = alDoilea;
//            alDoilea = next2;
//        }
/**Challenge 9. For-Each Loop
 Given an array of integers, write a program that prints each number in the array followed by "Even" if the number
 is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.*/

//        int[] lista = {10, 5, 6, 22, 23};
//        for (int number : lista) {
//            if (number % 2 == 0) {
//                System.out.println("Even: " + number);
//            } else {
//                System.out.println("Odd " + number);
//            }
//        }

/**Challenge 10. Jump Statements
 Create a menu-driven program where the user is presented with options:

 Print "Hello World"
 Print the user's name.
 Exit.
 Based on the user's input, perform the necessary action. Once an action is completed, show the menu again,
 unless the user chooses the Exit option. Use jump statements to control the flow of the program.*/

//        Scanner scanner5 = new Scanner(System.in);
//        while (true) {
//            System.out.println("Meniu: ");
//            System.out.println("1.Print Hello World");
//            System.out.println("2.Enter user name: ");
//            System.out.println("3.Exit ");
//            System.out.println("Please select a number from the menu 1,2 or 3: ");
//
//            int decizie = scanner5.nextInt();
//
//            switch (decizie) {
//                case 1:
//                    System.out.println("Hello World");
//                    break;
//                case 2:
//                    System.out.println("Enter your name: ");
//                    scanner5.nextLine();
//                    String name = scanner5.nextLine();
//                    System.out.println("Your name is: " + name);
//                    break;
//                case 3:
//                    System.out.println("Exiting program...");
//                    scanner5.close();
//                    return;
//                default:
//                    System.out.println("Invalid input. Please enter a number from the menu");
//            }
//        }

/**Challenge 11. . Break Statement
 Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
 If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.*/

//        Scanner scanner6 = new Scanner(System.in);
//
//        int count = 0;
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Insert a number or zero (0) to stop: ");
//            int number2 = scanner6.nextInt();
//            if (number2 == 0){
//                break;
//            }
//            sum += number2;
//            count++;
//        }
//        if (count == 0){
//            System.out.println("No numbers where entered");
//        }else {
//            double average = (double) sum / count;
//            System.out.println("The average of the numbers entered is: " + average);
//        }
//        scanner6.close();


/**Challenge 12.Continue Statement
 Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
 If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.*/

//        Scanner scanner7 = new Scanner(System.in);
//
//        int sum = 0;
//
//        System.out.println("Please insert 10 numbers");
//        /**Asking the user to insert 10 numbers*/
//        for (int i = 0; i < 10; i++){
//            System.out.println("Enter number " + (i+1) + " ");
//            int number = scanner7.nextInt();
//            /**If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number*/
//            if(number == 5){
//                continue;
//            }
//            sum += number;
//        }/**Print the sum of all numbers that are greater than 5*/
//        System.out.println("Sum of numbers greater than 5 is: " + sum);
//        scanner7.close();


/**Challenge 13.Pathfinding in a Maze
 Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end.
 You have to find a path from the start to the end, moving only up, down, left, or right. You can't move diagonally.
 If a path exists, print it; otherwise, inform the user that there's no solution.

 The maze will be represented by a 2D array where:
 0 represents an open cell.
 1 represents a wall.
 S represents the start.
 E represents the end.

 Example:
 S 1 0 1
 0 1 0 1
 0 1 0 1
 1 0 0 E

 Problem Tasks:
 Read the maze layout from a file or hard-code it into your program.
 Implement a pathfinding algorithm to navigate from the start to the end.
 If a path is found, print the maze with the path. You can represent the path with a *.
 If no path exists, print "No solution found."

 Hints:
 Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
 You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.*/

        char[][] maze = {
                {'S', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', '0', 'E'}
        };

        // Print the maze array
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }


/**How do I calculate space and time complexity?*/

//        int findMax ( int[] arr){
//            int max = Integer.MIN_VALUE;  // O(1)
//            for (int i = 0; i < arr.length; i++) {  // O(n)
//                if (arr[i] > max) {  // O(1)
//                    max = arr[i];  // O(1)
//                }
//            }
//            return max;  // O(1)
//        }

    }
}