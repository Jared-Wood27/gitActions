import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //Main Test1
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a command (add/subtract/multiply/divide/fibonacci/intToBinary):");
    String command = scanner.next();

    switch (command) {
      case "add":
        int addA = scanner.nextInt();
        int addB = scanner.nextInt();
        int addResult = calculator.add(addA, addB);
        System.out.println("Result: " + addResult);
        break;
      case "subtract":
        int subA = scanner.nextInt();
        int subB = scanner.nextInt();
        int subResult = calculator.subtract(subA, subB);
        System.out.println("Result: " + subResult);
        break;
      case "multiply":
        int mulA = scanner.nextInt();
        int mulB = scanner.nextInt();
        int mulResult = calculator.multiply(mulA, mulB);
        System.out.println("Result: " + mulResult);
        break;
      case "divide":
        int divA = scanner.nextInt();
        int divB = scanner.nextInt();
        int divResult = calculator.divide(divA, divB);
        System.out.println("Result: " + divResult);
        break;
      case "fibonacci":
        int fibN = scanner.nextInt();
        int fibResult = calculator.fibonacciNumberFinder(fibN);
        System.out.println("Result: " + fibResult);
        break;
      case "intToBinary":
        int binaryN = scanner.nextInt();
        String binaryResult = calculator.intToBinaryNumber(binaryN);
        System.out.println("Result: " + binaryResult);
        break;
      default:
        System.out.println("Invalid command.");
    }

    scanner.close();
  }
}