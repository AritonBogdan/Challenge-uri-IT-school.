import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Curs07 {
    public static void main(String[] args) {
/**Challenge 1. Displaying Today's Date
 Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
 Expected Output: Today's date in the format YYYY-MM-DD.*/

//         LocalDate displayTodaysDate = LocalDate.now();
//        System.out.println(displayTodaysDate);

/** Challenge 2. Date Decomposition
 Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month,
 and day components separately.
 Input: A date in the format YYYY-MM-DD.
 Expected Output:
 makefile
 Copy code
 Year: YYYY
 Month: MM
 Day: DD*/

//        LocalDate displayDateComponents = LocalDate.now();
//        LocalDate displayDateComponents2 = LocalDate.now();
//
//        System.out.println("makefile");
//        System.out.println("Copy code");
//        System.out.println("Year: " + displayDateComponents2.getYear());
//        System.out.println("Month: " + displayDateComponents2.getMonthValue());
//        System.out.println("Day: " + displayDateComponents2.getDayOfMonth());

/**Challenge 3. Create a Specific Date
 Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
 Expected Output: A date object for 2025-8-19.*/

//        LocalDate createSpecificDate = LocalDate.of(2025,8,19);
//        System.out.println("The specific date is: " + createSpecificDate);

/**Challenge 4. Comparing User-Entered Dates
 Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
 Input: Two dates entered by the user in the format YYYY-MM-DD.
 Expected Output:
 true if both dates are equal.
 false if they are different.*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first date: ");
//        String date1 = scanner.nextLine();
//        System.out.println("Enter the second date: ");
//        String date2 = scanner.nextLine();

//        boolean result = areDatesEqual(date1, date2);

//        System.out.println("Are dates equals? True for yes and False for no. ");
//        if(areDatesEqual(date1,date2) == true){
//            System.out.println("Dates are equal!");
//        }else {
//            System.out.println("Dates are not equal!");
//        }
//        System.out.println("The answer is " + result);
//    }
//
//    public static boolean areDatesEqual(String date1, String date2) {
//        LocalDate date11=LocalDate.parse(date1);
//        LocalDate date22=LocalDate.parse(date2);
//        if (date11.equals(date22)){
//            return true;
//        }else {
//            return false;
//        }

/**Challenge 5. Is Today a Specific Date?
 Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
 Expected Output:
 true if today's date is 2019-12-10.
 false otherwise*/

//        // Check if today's date is 10th December 2019
//        boolean result = isTodaySpecificDate(2019, 12, 10);
//
//        // Display the result
//        System.out.println("Is today 10th December 2019? " + result);
//    }
//
//    public static boolean isTodaySpecificDate(int year, int month, int dayOfMonth) {
//        // Get today's date
//        LocalDate today = LocalDate.now();
//
//        // Create a LocalDate object for the specific date (10th December 2019)
//        LocalDate specificDate = LocalDate.of(year, month, dayOfMonth);
//
//        // Check if today's date is equal to the specific date
//        return today.equals(specificDate);


/**Challenge 6. Getting Current Time
 Description: Write a method named displayCurrentTime that prints the current time to the console.
 Expected Output: The current time in the format HH:MM:SS.*/
//        // Call the displayCurrentTime method to print the current time
//        displayCurrentTime();
//    }
//
//    public static void displayCurrentTime() {
//        // Get the current time
//        LocalTime currentTime = LocalTime.now();
//
//        // Define a DateTimeFormatter for the desired format (HH:MM:SS)
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        // Format the current time using the formatter
//        String formattedTime = currentTime.format(formatter);
//
//        // Print the formatted current time
//        System.out.println("The current time is: " + formattedTime);

/**Challenge 7. Date Arithmetic
 Description: Write a method named addWeeksToToday that accepts an integer as its argument.
 This integer denotes the number of weeks. The method should add this number of weeks to today's date and return the resultant date.
 Input: An integer n (e.g., 4).
 Expected Output: A date object that is n weeks from today. */
//        int weeksToAdd = 4;
//        LocalDate today = LocalDate.now();
//        LocalDate addWeeksToToday = today.plusWeeks(weeksToAdd);
//        System.out.println(addWeeksToToday);

/**Challenge 8. Weekday Identifier
 Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week
 (e.g., Monday, Tuesday, etc.) for that date.
 Input: A date in the format YYYY-MM-DD.
 Expected Output: The day of the week in string format (e.g., "Wednesday").*/

//        LocalDate today = LocalDate.now();
//        DateTimeFormatter formatday = DateTimeFormatter.ofPattern("YYYY-MM-dd");
//        String formatToday = today.format(formatday);
//        String findDayofWeek = String.valueOf(today.getDayOfWeek());
//        System.out.println("Input");
//        System.out.println("A date in the format YYYY-MM-DD is: " + formatToday);
//        System.out.println("Output");
//        System.out.println("The day of the week in the string format is: " + findDayofWeek);

/**Challenge 9. Interval Between Dates
 Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
 Input: Two dates given by the user in the format YYYY-MM-DD.
 Expected Output: An integer showcasing the difference in days between the two dates. */

//// Call the daysBetween method and print the result
//        int difference = daysBetween();
//        System.out.println("The difference in days between the two dates is: " + difference);
//    }
//        public static int daysBetween() {
//            // Create a scanner object to read input from the console
//            Scanner scanner = new Scanner(System.in);
//
//            // Prompt the user to enter the first date
//            System.out.print("Enter the first date (YYYY-MM-DD): ");
//            String dateString1 = scanner.nextLine();
//
//            // Prompt the user to enter the second date
//            System.out.print("Enter the second date (YYYY-MM-DD): ");
//            String dateString2 = scanner.nextLine();
//
//            // Close the scanner
//            scanner.close();
//
//            // Parse the input strings into LocalDate objects
//            LocalDate date1 = LocalDate.parse(dateString1, DateTimeFormatter.ISO_DATE);
//            LocalDate date2 = LocalDate.parse(dateString2, DateTimeFormatter.ISO_DATE);
//
//            // Calculate the difference in days between the two dates
//            int daysDifference = (int) Math.abs(date1.until(date2).getDays());
//
//            return daysDifference;

/**10. Date Authenticator
 Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms
 to a valid date format (YYYY-MM-DD). The method should also consider leap years when validating February dates.
 Input: A string of a date from the console.
 Expected Output: true if the input adheres to the date format and denotes a genuine date. false if otherwise.*/

//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a date
//        System.out.print("Enter a date (YYYY-MM-DD): ");
//        String inputDate = scanner.nextLine();
//
//        // Validate the input date
//        boolean isValid = isValidDate(inputDate);
//
//        // Print the result
//        if (isValid) {
//            System.out.println("The input date is valid.");
//        } else {
//            System.out.println("The input date is not valid.");
//        }
//
//        scanner.close();
//    }
//
//    public static boolean isValidDate(String dateStr) {
//        try {
//            // Attempt to parse the input string into a LocalDate object
//            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_DATE);
//
//            // Check if the parsed date matches the original input string
//            // This helps ensure that the input string adheres to the correct format
//            if (!dateStr.equals(date.format(DateTimeFormatter.ISO_DATE))) {
//                return false;
//            }
//
//            // Additional checks for specific months and days
//            int year = date.getYear();
//            int month = date.getMonthValue();
//            int day = date.getDayOfMonth();
//
//            // Check for February in leap years
//            if (month == 2 && day == 29) {
//                return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
//            }
//
//            return true;
//        } catch (Exception e) {
//            // If an exception occurs during parsing, the input is not a valid date
//            return false;
//        }

/**Challenge 11. Duration Since
 Description: Construct a method dubbed elapsedTimeSince that ingests a prior time (in the HH:MM:SS format)
 as its input and displays the time duration from that moment to the present.
 Input: A time given in the format HH:MM:SS.
 Expected Output: The time span given as X hours, Y minutes, Z seconds*/

//        LocalTime time = LocalTime.of(9, 5, 35);
//        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
//        String formatedTime = time.format(formatTime);
//        System.out.println("Time is: " + formatedTime);
//
//        elapsedTimeSince(formatedTime);
//    }
//
//    public static void elapsedTimeSince(String priorTime) {
//        LocalTime prior = LocalTime.parse(priorTime);
//        LocalTime now = LocalTime.now();
//        Duration duration = Duration.between(prior, now);
//        long hours = duration.toHours();
//        long minutes = duration.toMinutesPart();
//        long seconds = duration.toSecondsPart();
//
//        // Print the elapsed time
//        System.out.printf("Time elapsed since %s: %d hours, %d minutes, %d seconds%n", priorTime, hours, minutes, seconds);

/**Challenge 12. Time Conversion Across Zones
 Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD HH:MM:SS
 and a timezone (like "EST", "PST"). The objective is to transmute the specified date and time to align with the provided timezone and
 then showcase the result.
 Input: Date and time structured as YYYY-MM-DD HH:MM:SS. A string indicating the timezone (e.g., "EST").
 Expected Output: The recalibrated date and time synchronized with the inputted timezone.*/

//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter the date and time
//        System.out.print("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
//        String dateTimeStr = scanner.nextLine();
//
//        // Prompt the user to enter the timezone
//        System.out.print("Enter timezone (e.g., EST, PST): ");
//        String timeZone = scanner.nextLine();
//
//        // Convert to the specified timezone and display the result
//        convertToTimeZone(dateTimeStr, timeZone);
//
//        scanner.close();
//    }
//    public static void convertToTimeZone(String dateTimeStr, String timeZone) {
//        // Parse the input date and time string into a LocalDateTime object
//        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//
//        // Get the ZoneId for the specified timezone
//        ZoneId zoneId = ZoneId.of(timeZone);
//
//        // Convert the LocalDateTime to the specified timezone
//        LocalDateTime convertedDateTime = dateTime.atZone(ZoneOffset.systemDefault())
//                .withZoneSameInstant(zoneId)
//                .toLocalDateTime();
//
//        // Display the recalibrated date and time synchronized with the inputted timezone
//        System.out.println("Converted date and time: " + convertedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

/**Challenge 13.Event Scheduler and Reminder SLIDE 22-24*/
    }
}

