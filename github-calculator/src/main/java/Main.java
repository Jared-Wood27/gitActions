import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //Main Test1
    boolean keepGoing = true;
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a command (add/subtract/multiply/divide/fibonacci/binary/done):");
    String command = scanner.next();

    while(keepGoing) {
      switch (command) {
        case "add":
          int addA=scanner.nextInt();
          int addB=scanner.nextInt();
          int addResult=calculator.add(addA, addB);
          System.out.println(addResult);
          break;
        case "subtract":
          int subA=scanner.nextInt();
          int subB=scanner.nextInt();
          int subResult=calculator.subtract(subA, subB);
          System.out.println(subResult);
          break;
        case "multiply":
          int mulA=scanner.nextInt();
          int mulB=scanner.nextInt();
          int mulResult=calculator.multiply(mulA, mulB);
          System.out.println(mulResult);
          break;
        case "divide":
          int divA=scanner.nextInt();
          int divB=scanner.nextInt();
          int divResult=calculator.divide(divA, divB);
          System.out.println(divResult);
          break;
        case "fibonacci":
          int fibN=scanner.nextInt();
          int fibResult=calculator.fibonacciNumberFinder(fibN);
          System.out.println(fibResult);
          break;
        case "binary":
          int binaryN=scanner.nextInt();
          String binaryResult=calculator.intToBinaryNumber(binaryN);
          System.out.println(binaryResult);
          break;
        case "done":
          System.out.println("Not even a thank you?");
          keepGoing = false;
          break;
        default:
          System.out.println("Invalid command.");
      }
      if(keepGoing == true){
        command = scanner.next();
      }
    }

    scanner.close();
    System.out.println("Goodbye!");
  }
}