package calc;
import java.util.Scanner;
 
public class calc {
 
    public static void main(String[] args) {
 
            Scanner scanner = new Scanner(System.in);
            math math = new math();
 
            while (true) {
 
                System.out.print("Enter something : ");
                String input = scanner.nextLine();
 
                if ("q".equals(input)) {
                    System.out.println("Exit!");
                    break;
                }
 
                System.out.println("input : " + input);
                System.out.println("-----------\n");
                String[] arrOfStr = input.split("[ ]+");
                
                switch(arrOfStr[1])
                {
                   case "+" :
                      System.out.println(math.Add(arrOfStr[0], arrOfStr[2])); 
                      break;
                   case "-" :
                      System.out.println(math.Subtract(arrOfStr[0], arrOfStr[2])); 
                      break;
                   case "*" :
                       System.out.println(math.Multiply(arrOfStr[0], arrOfStr[2])); 
                       break;
                   case "/" :
                       System.out.println(math.Divide(arrOfStr[0], arrOfStr[2])); 
                       break;
                   default :
                	   throw new ArithmeticException("Неверная операция");
                }
            }
            scanner.close();
    }
}

