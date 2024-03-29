import java.security.SecureRandom;
import java.math.BigInteger;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return -1; // Error code to indicate invalid input
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int prev = 1;
            int current = 1;
            for (int i = 3; i <= n; i++) {
                int next = prev + current;
                prev = current;
                current = next;
            }
            return current;
        }
    }

    //success after 11 commits yeet!

    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return ""; // Empty string to indicate invalid input
        } else if (n == 0) {
            return "0";
        } else {
            StringBuilder binaryString = new StringBuilder();
            while (n > 0) {
                int remainder = n % 2;
                binaryString.insert(0, remainder); // Insert at the beginning of the string
                n = n / 2;
            }
            return binaryString.toString();
        }
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique
    if you run this function twice with the same String input, it must return 2 unique String IDs
     */

    private static final SecureRandom random = new SecureRandom();

    String createUniqueID(String n){
        // Generate a random suffix using a secure random number generator
        String randomSuffix = new BigInteger(130, random).toString(32);

        // Create the unique ID by combining the original string and the random suffix
        String uniqueID = n + randomSuffix;
        return uniqueID;
    }


}
