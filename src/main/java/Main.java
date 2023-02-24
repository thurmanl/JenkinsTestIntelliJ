import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Calculator calc = new Calculator();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command: [add, sub, mult, div, fib, bin]");

    String command = "";
    while(!command.equals("quit")){
      command = myObj.nextLine();
      String[] parts = command.split(" ");
      System.out.println("you input: " + command);
      String result = "";
      command = parts[0];
      if(command.equals("add")){
        result =String.valueOf(calc.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
      }
      else if(command.equals("sub")){
        result =String.valueOf(calc.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
      }
      else if(command.equals("mult")){
        result =String.valueOf(calc.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
      }
      else if(command.equals("div")){
        result =String.valueOf(calc.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
      }
      else if(command.equals("fib")){
        result =String.valueOf(calc.fibonacciNumberFinder(Integer.parseInt(parts[1])));
      }
      else if(command.equals("bin")){
        result = calc.intToBinaryNumber(Integer.parseInt(parts[1]));
      }
      else if(command.equals("quit")){
        System.out.println("Goodbye");
        break;
      }
      else{
        result = "incorrect input";
      }
      System.out.println("answer: " + result);
    }
  }
}
