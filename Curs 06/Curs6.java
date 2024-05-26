import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Curs6 {
    public static void main(String[] args) {

/**Challenge 1.Reverse a String
 * Description: Use the StringBuilder class to write a program that reverses an input string.
 * For example, the input "hello" should return "olleh". */

//        StringBuilder word = new StringBuilder("Hello");
//        word.reverse();
//        System.out.println(word);

/**Challenge 2.Palindrome Checker
 Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
 A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward. */

//        StringBuilder polindrome = new StringBuilder("tot");
//        polindrome.reverse();
//        System.out.println(polindrome.toString().equalsIgnoreCase(String.valueOf(polindrome)));

/**Challenge 3.Concatenate Multiple Strings
 Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.*/

//        StringBuilder strings = new StringBuilder("String");
//        strings.append("+cuvant");
//        StringBuilder acelasi = strings.append("+ceva nou");
//        System.out.println(acelasi);

/**Challenge 4.Removing Vowels
 Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//
//        String result = removeVowels(input);
//        System.out.println("String after removing vowels: " + result);
//    }
//    public static String removeVowels(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (!isVowel(ch)) {
//                sb.append(ch);
//            }
//        }
//        return sb.toString();
//    }
//
//    public static boolean isVowel(char ch) {
//        ch = Character.toLowerCase(ch);
//        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

/**Challenge 5. . Word Capitalizer
 * Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class*/

//        String sentence = "Aceasta este o propozitie simpla";
//        String capitalizedSentence = capitalizeFirstLetter(sentence);
//        System.out.println("Propozitia normala este: " + capitalizedSentence);
//    }
//
//    public static String capitalizeFirstLetter(String sentence) {
//        StringBuilder sb = new StringBuilder();
//        boolean capitalizeNext = true;
//        for (int i = 0; i < sentence.length(); i++) {
//            char ch = sentence.charAt(i);
//            if (Character.isWhitespace(ch)) {
//                capitalizeNext = true;
//                sb.append(ch);
//            } else if ((capitalizeNext)) {
//                sb.append(Character.toUpperCase(ch));
//                capitalizeNext = false;
//            } else {
//                sb.append(ch);
//            }
//        }
//        return sb.toString();

/**Challenge 6.String Replacement
 Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
 For instance, replace "cat" with "dog" in the string "The cat sat on the mat."
 */
//        String sentence = "The cat sat on the mat";
//        String oldString = "cat";
//        String newString = "dog";
//        StringBuilder sb = new StringBuilder();
//        String newSentence = sentence.replace(oldString, newString);
//        System.out.println(newSentence);

/**Challenge 7. Duplicate Character Remover
 Description: Design a program using StringBuilder that removes duplicate characters from a string.
 For example, "balloon" should become "balon".
 */
        //Varianta 1
//        StringBuilder sb = new StringBuilder("Ballon");
//        sb.deleteCharAt(2);
//        System.out.println(sb.toString());

        //Varianta 2
//        String input = "ballon";
//        StringBuilder sb = new StringBuilder();
//        boolean[] seen = new boolean[256];
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (!seen[ch]) {
//                sb.append(ch);
//                seen[ch] = true;
//            }
//        }
//        System.out.println(sb.toString());

/**Challenge 8.Inserting at Index
 Description: Write a Java program that inserts a given string into another string at a specified index using the StringBuilder class.*/

//        String aString = "Primul";
//        StringBuilder sb = new StringBuilder("Cuvant");
//        sb.insert(0, aString);
//        sb.insert(6, " ");
//        System.out.println(sb.toString());

/**Challenge 9.Frequency Counter
 Description: Using StringBuilder, write a program that counts the frequency of each character in a string.*/

//        String input = "hello world";
//        Map<Character, Long> frequencyMap = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println("Character frequencies:");
//        frequencyMap.forEach((character, frequency) -> System.out.println(character + ": " + frequency));

/**Challenge 10. Morse Code Converter
 Description: Create a program that takes in a string and converts it to Morse code using the StringBuilder class.
 For simplicity, you can assume the input string only contains alphabets and numbers.*/

//        String input = "Hello 99";
//        String[] morseCodeArray = {
//                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // A-I
//                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", // J-R
//                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", // S-Z and 0-9
//                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
//
//        StringBuilder morseStringBuilder = new StringBuilder();
//
//        for (char ch : input.toUpperCase().toCharArray()) {
//            if (ch >= 'A' && ch <= 'Z') {
//                morseStringBuilder.append(morseCodeArray[ch - 'A']).append(" ");
//            } else if (ch >= '0' && ch <= '9') {
//                morseStringBuilder.append(morseCodeArray[ch - '0' + 26]).append(" ");
//            } else {
//                morseStringBuilder.append(" ");
//            }
//        }
//        System.out.println(morseStringBuilder.toString());

/**Challenge 11. Encode and Decode using Caesar Cipher
 Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class.
 The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet.
 For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on*/

//        String plaintext = "HELLO WORLD";
////        int shift = 3;
////        StringBuilder encryptedText = new StringBuilder();
////
////        for (char ch : plaintext.toCharArray()) {
////            if (Character.isLetter(ch)) {
////                char shiftedChar = (char) ('A' + (ch - 'A' + shift) % 26);
////                encryptedText.append(shiftedChar);
////            } else {
////                encryptedText.append(ch); // Keep non-letter characters unchanged
////            }
////        }
////        System.out.println(encryptedText.toString());

/**Challenge 12.CamelCase to Snake_case Converter
 Description: Write a program using StringBuilder to convert a given CamelCase string to snake_case.
 For instance, "thisIsCamelCase" would become "this_is_camel_case". */

//        String camelCaseString = "thisIsCamelCase";
//        String camelCase = "this_is_camel_case";
//
//        StringBuilder snakeCase = new StringBuilder();
//
//        for (char c : camelCase.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                snakeCase.append("_").append(Character.toLowerCase(c));
//            } else {
//                snakeCase.append(c);
//            }
//        }
//        System.out.println(snakeCase.toString());


/**Challenge 13.Expand Compressed Strings
 Description: Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of the StringBuilder class */

//        String compressedString = "a3b2c4";
//        StringBuilder sb = new StringBuilder();
//        StringBuilder expandedString = new StringBuilder();
//        for (int i = 0; i < compressedString.length(); i += 2) {
//            char character = compressedString.charAt(i);
//            int count = Character.getNumericValue(compressedString.charAt(i + 1));
//            for (int j = 0; j < count; j++) {
//                expandedString.append(character);
//            }
//        }
//        System.out.println(expandedString.toString());


/**Challenge 14.Remove Comments from Code
 Description: Create a Java program using StringBuilder that removes all single line (//) and multi-line
 ("/* * comments from a provided piece of code.*/

//        String codeWithComments = """
//                // This is a single-line comment
//                public class Example {
//                    /* This is a multi-line
//                    comment */
//                    public static void main(String[] args) {
//                        // This is another single-line comment
//                        System.out.println("Hello, world!"); // This is an inline comment
//                    }
//                }
//                """;
//        String codeWithoutComments = removeComments(codeWithComments);
//        System.out.println(codeWithoutComments);
//    }
//
//    public static String removeComments(String code) {
//        StringBuilder result = new StringBuilder();
//        boolean inSingleLineComment = false;
//        boolean inMultiLineComment = false;
//
//        for (int i = 0; i < code.length(); i++) {
//            char currentChar = code.charAt(i);
//
//            if (inSingleLineComment) {
//                if (currentChar == '\n') {
//                    inSingleLineComment = false;
//                }
//            } else if (inMultiLineComment) {
//                if (currentChar == '*' && i < code.length() - 1 && code.charAt(i + 1) == '/') {
//                    inMultiLineComment = false;
//                    i++;
//                }
//            } else {
//                if (currentChar == '/' && i < code.length() - 1) {
//                    char nextChar = code.charAt(i + 1);
//                    if (nextChar == '/') {
//                        inSingleLineComment = true;
//                        i++;
//                        continue;
//                    } else if (nextChar == '*') {
//                        inMultiLineComment = true;
//                        i++;
//                        continue;
//                    }
//                }
//                result.append(currentChar);
//            }
//        }
//        return result.toString();

/**Challenge 15. Anagram Checker
 Description: Develop a program that checks if two provided strings are anagrams of each other using the StringBuilder class.
 Anagrams are words or phrases made up of the same characters.*/

//        String p1 = "listen";
//        String p2 = "silent";
//        boolean areAnagrams = checkIfAnagrams(p1, p2);
//        if (areAnagrams) {
//            System.out.println("The strings '" + p1 + "' and '" + p2 + "' are anagrams.");
//        } else {
//            System.out.println("The strings '" + p1 + "' and '" + p2 + "' are not anagrams.");
//        }
//    }
//
//    public static boolean checkIfAnagrams(String p1, String p2) {
//        if (p1.length() != p2.length()) {
//            return false;
//        }
//
//        StringBuilder sb = new StringBuilder(p2);
//
//        for (int i = 0; i < p1.length(); i++) {
//            int index = sb.indexOf(String.valueOf(p1.charAt(i)));
//            if (index == -1) {
//                return false;
//            }
//            sb.deleteCharAt(index);
//        }
//        return true;

/**Challenge 16. Toggling Case
 Description: Design a program using StringBuilder that toggles the case of every character in a given string.
 For example, "HelLo" should become "hELlO".*/
//        String input = "HelLo";
//        String toggledString = toggleCase(input);
//        System.out.println(toggledString);
//    }
//
//    public static String toggleCase(String input) {
//        StringBuilder toggled = new StringBuilder();
//
//        for (char c : input.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                toggled.append(Character.toLowerCase(c));
//            } else if (Character.isLowerCase(c)) {
//                toggled.append(Character.toUpperCase(c));
//            } else {
//                toggled.append(c);
//            }
//        }
//
//        return toggled.toString();

/**Challenge 17. String Interleaver
 Description: Write a program using StringBuilder that interleaves two strings.
 For instance, given "abc" and "123", the result should be "a1b2c3".*/

//        String characthers ="abc";
//        String numbers = "123";
//        String interleavedString = interleaveStrings(characthers, numbers);
//        System.out.println(interleavedString);
//    }
//    public static String interleaveStrings(String str1, String str2) {
//        StringBuilder interleaved = new StringBuilder();
//
//        int maxLength = Math.max(str1.length(), str2.length());
//
//        for (int i = 0; i < maxLength; i++) {
//            if (i < str1.length()) {
//                interleaved.append(str1.charAt(i));
//            }
//            if (i < str2.length()) {
//                interleaved.append(str2.charAt(i));
//            }
//        }
//        return interleaved.toString();
/**Challenge 18.Pattern Recognition
 Description: Design a Java program using StringBuilder that checks if a given pattern repeats in a string.
 For instance, given the string "ababab", the repeating pattern is "ab". */

//        String input = "atatat";
//        String pattern = findRepeatedPattern(input);
//
//        if (pattern != null) {
//            System.out.println("The repeating pattern is: " + pattern);
//        } else {
//            System.out.println("No repeating pattern found.");
//        }
//    }
//
//    public static String findRepeatedPattern(String input) {
//        int n = input.length();
//
//        for (int len = 1; len <= n / 2; len++) {
//            if (n % len == 0) {
//                String pattern = input.substring(0, len);
//                StringBuilder sb = new StringBuilder();
//
//                for (int i = 0; i < n / len; i++) {
//                    sb.append(pattern);
//                }
//
//                if (sb.toString().equals(input)) {
//                    return pattern;
//                }
//            }
//        }
//
//        return null;

/**Challenge 19. Encode Strings with Run-Length Encoding (RLE)
 Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm.
 For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".*/

//        String input = "AAABBBCCDAA";
//        String encodedString = encode(input);
//        System.out.println(encodedString);
//    }
//    public static String encode(String input) {
//        StringBuilder encoded = new StringBuilder();
//        int count = 1;
//
//        for (int i = 1; i < input.length(); i++) {
//            if (input.charAt(i) == input.charAt(i - 1)) {
//                count++;
//            } else {
//                encoded.append(count).append(input.charAt(i - 1));
//                count = 1;
//            }
//        }
//        encoded.append(count).append(input.charAt(input.length() - 1));
//        return encoded.toString();

/**challenge 20. Balanced Parenthesis Checker
 Description: Develop a program that checks if a string has balanced parentheses ((, ), {, }, [, and ]) using StringBuilder.
 The program should return true if the parentheses in the string are balanced and false otherwise.*/

//        String input = "())";
//        boolean isBalanced = checkBalancedParentheses(input);
//        System.out.println("Are the parentheses balanced? " + isBalanced);
//    }
//
//    public static boolean checkBalancedParentheses(String input) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : input.toCharArray()) {
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else if (c == ')' || c == '}' || c == ']') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char top = stack.pop();
//                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();

/**Challenge 21. Given an integer, convert it to a roman numeral*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert a number to convert it to roman numeral: ");
//        int num = scanner.nextInt();
//
//        String romanNumeral = intToRoman(num);
//        System.out.println("Roman numeral for " + num + " is: " + romanNumeral);
//    }
//    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//
//
//    public static String intToRoman(int num) {
//        StringBuilder roman = new StringBuilder();
//
//        for (int i = 0; i < values.length; i++) {
//            while (num >= values[i]) {
//                num -= values[i];
//                roman.append(symbols[i]);
//            }
//        }
//
//        return roman.toString();


        /**QUESTION: What is StringBuffer and how is different from StringBuilder?*/

        /**ANSWER: StringBuffer and StringBuilder are both classes in Java used to create and manipulate
         *  mutable sequences of characters. However, they have some key differences:
         *  1.Mutability *** 2. Thread-safety *** 3.Performance
         *  In summary, if you require thread safety, you should use StringBuffer. Otherwise,
         *  if you do not need thread safety and want better performance, StringBuilder is the preferred choice*/
    }

}







