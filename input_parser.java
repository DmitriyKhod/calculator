import java.util.regex.Pattern;

public class input_parser {
	   public task parse_input(String input) {
		   
		   task intask = new task();
		   
	       String[] arrOfStr = input.split("[ ]+");
	       switch(arrOfStr[1])
	       {
	          case "+" :
	        	  intask.operation = "+";
	             break;
	          case "-" :
	        	  intask.operation = "-";
	             break;
	          case "*" :
	        	  intask.operation = "*";
	              break;
	          case "/" :
	        	  intask.operation = "/";
	              break;
	          default :
	              throw new ArithmeticException("Неверная операция");
	       }
	       
	       if(Pattern.matches("\\d+", arrOfStr[0])&&Pattern.matches("\\d+", arrOfStr[2]) ){
	    	   intask.operand1 = Integer.parseInt(arrOfStr[0]);
	    	   intask.operand2 = Integer.parseInt(arrOfStr[2]);
	           if ((intask.operand1 >0)&&(intask.operand1 < 11)&&(intask.operand2 >0)&&(intask.operand2 < 11))
	        	   intask.rim_mode =0;
	           else {throw new ArithmeticException("Неверная операция");}
	       }
	       else {
	    	   intask.operand1 = rimtodigit(arrOfStr[0]) ;
	    	   intask.operand2 = rimtodigit(arrOfStr[2]) ;
	    	   intask.rim_mode = 1;
	       }
	       
	       return intask;
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

