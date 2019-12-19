import java.util.regex.Pattern;

public class input_parser {
	   public static int rim_mode = 0;
	   public static String operation = ""; 
	   public static int rezult = 0;
	   public static int operand1 =0;
	   public static int operand2 =0;
	
	   public task parse_input(String input) {
		   
	       String[] arrOfStr = input.split("[ ]+");
	       switch(arrOfStr[1])
	       {
	          case "+" :
	             operation = "+";
	             break;
	          case "-" :
	              operation = "-";
	             break;
	          case "*" :
	              operation = "*";
	              break;
	          case "/" :
	              operation = "/";
	              break;
	          default :
	              throw new ArithmeticException("Неверная операция");
	       }
	       
	       rim_mode = checker(arrOfStr[0],arrOfStr[2]);
	       
		   task task = new task(rim_mode,operation,rezult ,operand1,operand2);
	       return task;
	   }
	   
	   private static int checker(String a,String b){
		      
	       if(Pattern.matches("\\d+", a)&&Pattern.matches("\\d+", b) ){
	    	   operand1 = Integer.parseInt(a);
	    	   operand2 = Integer.parseInt(b);
	           if ((operand1 >0)&&(operand1 < 11)&&(operand2 >0)&&(operand2 < 11))
	           return 0;
	           else {throw new ArithmeticException("Неверная операция");}
	       }
	       
	       operand1 = rimtodigit(a) ;
	       operand2 = rimtodigit(b) ;
	       return 1;
	   }
	   
	   private static int rimtodigit(String a){

	       switch(a)
	       {
	          case "I" : return 1; 
	          case "II" : return 2; 
	          case "III" : return 3;
	          case "IV" : return 4; 
	          case "V" : return 5; 
	          case "VI" : return 6; 
	          case "VII" : return 7; 
	          case "VIII" : return 8; 
	          case "IX" : return 9; 
	          case "X" : return 10; 
	       }
	       
	       throw new ArithmeticException("Неверная операция");
	   }
}
