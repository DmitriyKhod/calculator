import java.util.Scanner;

public class calc {
 
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            task task = new task();
            math math = new math();
            printer printer = new printer();
            input_parser input_parser = new input_parser();

            while (true) {
                System.out.print("Enter task ('q' for exit) : ");
                String input = scanner.nextLine();
 
                if ("q".equals(input)) {
                    System.out.println("Exit!");
                    break;
                }
                
               task = input_parser.parse_input(input);
               task = math.docalculation1(task);
               printer.print(task);

            }
            scanner.close();
    }
}
