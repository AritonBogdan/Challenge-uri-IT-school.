import java.lang.reflect.Array;
import java.util.*;

public class Curs08 {
    public static void main(String[] args) {

/**Challenge 1.Create a shopping list with Array and print the values*/

        String[] shoppingList = {"Tomato", "Carrots", "Cabage"};
        String[] shoppingLitItems = Arrays.copyOfRange(shoppingList, 0, 3);
        for (String ItemsShoppingList : shoppingLitItems) {
            System.out.println(ItemsShoppingList + " ");
        }

/**Challenge 2.Create a wishlist for christmas with ArrayList and print the values*/

        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("Shoes");
        wishList.add("Jacket");
        wishList.add("Hat");
        System.out.println("WishList:" + wishList);

/**Challenge 3.Create:
 - 2 empty ArrayLists: studentList and graduateStudentList
 - populate studentList with 10 students
 - copy values from studentList to graduateStudentList
 - iterate through graduateStudentList and print each graduated student*/

        ArrayList<String> StudentList = new ArrayList<String>();
        StudentList.add("Alex");
        StudentList.add("Bogdan");
        StudentList.add("Oltea");
        StudentList.add("Ruxandra");
        StudentList.add("Roman");
        StudentList.add("Claudiu");
        StudentList.add("Ariton");
        StudentList.add("Denis");
        StudentList.add("Elena");
        StudentList.add("Maria");
        ArrayList<String> GraduateStudentList = new ArrayList<String>(StudentList);
        for (String graduatePupils : GraduateStudentList) {
            System.out.println("Graduated Student: " + graduatePupils);
        }

/**Challenge 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.*/

        int[] array = new int[]{10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

/**Challenge 5. Create an ArrayList that stores city names. Add at least five city names initially.
 * Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate;
 * otherwise, add it to the list. */

        ArrayList<String> CityNames = new ArrayList<String>();
        CityNames.add("Timisoara");
        CityNames.add("Oradea");
        CityNames.add("Arad");
        CityNames.add("Cluj");
        CityNames.add("Bucuresti");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a city: ");
        String newCity = scanner.nextLine();
        if (CityNames.contains(newCity)) {
            System.out.println("The city is already in the list.");
        } else {
            CityNames.add(newCity);
            System.out.println("City added successfully.");
        }
        System.out.println("Updated list of cities: " + CityNames);

/**Challenge 6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
 *  If it does, remove that name from the list.*/

        LinkedList<String> studentNames = new LinkedList<>();
        studentNames.add("Bogdan");
        studentNames.add("Claudiu");
        studentNames.add("Ariton");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Check the names: ");
        String checkName = scanner1.nextLine();

        if (studentNames.contains(checkName)) {
            studentNames.remove(checkName);
            System.out.println("Student name removed successfully.");
        } else {
            studentNames.add(checkName);
            System.out.println("Student name added successfully.");
        }
        System.out.println("The list of names is: " + studentNames);

/**Challenge 7. Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them
 *  in descending order based on their length. If two fruits have the same length, sort them in alphabetical order. */

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("melon");
        fruits.add("strawberries");

        fruits.sort(Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println("Sorted list of fruits: " + fruits);

/**Challenge 8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie
 *  title exists. If it does, print out its position in the array.*/

        String[] movies = {"The Shawshank Redemption", "The Godfather", "The Dark Knight", "Pulp Fiction", "The Lord of the Rings", "Forrest Gump"};

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Find the movie: ");
        String findMovie = scanner2.nextLine();

        // Perform linear search
        int position = linearSearch(movies, findMovie);
        // Print the result
        if (position != -1) {
            System.out.println("The movie \"" + findMovie + "\" is found at position " + position);
        } else {
            System.out.println("The movie \"" + findMovie + "\" is not found in the array");
        }
    }

    // Linear search method
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // Return the index if the movie is found
            }
        }
        return -1; // Return -1 if the movie is not found

/**Challenge 9.Accept a string representation of a binary number, e.g., "1011". Convert this string into an Integer using
 * the Integer wrapper class and the method that parses binary. Print out the decimal representation of this number.*/

        // Binary string representation
        String binaryStringX = "1011";

        // Parse binary string to integer
        int decimalNumber = Integer.parseInt(binaryStringX, 2);

        // Print the decimal representation
        System.out.println("Decimal representation of " + binaryString + " is: " + decimalNumber);
    }
}

