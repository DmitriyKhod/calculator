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
	    	   intask.operand1 = RomanToDecimal(arrOfStr[0]) ;
	    	   intask.operand2 = RomanToDecimal(arrOfStr[2]) ;
	    	   intask.rim_mode = 1;
	       }
	       
	       return intask;
	   }
	   
	   private static int RomanToDecimal(String romanNumber) {
	        int decimal = 0;
	        int lastNumber = 0;
	        String romanNumeral = romanNumber.toUpperCase();

	        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
	            char convertToDecimal = romanNumeral.charAt(x);

	            switch (convertToDecimal) {

	                case 'C':
	                    decimal = processDecimal(100, lastNumber, decimal);
	                    lastNumber = 100;
	                    break;

	                case 'L':
	                    decimal = processDecimal(50, lastNumber, decimal);
	                    lastNumber = 50;
	                    break;

	                case 'X':
	                    decimal = processDecimal(10, lastNumber, decimal);
	                    lastNumber = 10;
	                    break;

	                case 'V':
	                    decimal = processDecimal(5, lastNumber, decimal);
	                    lastNumber = 5;
	                    break;

	                case 'I':
	                    decimal = processDecimal(1, lastNumber, decimal);
	                    lastNumber = 1;
	                    break;
	            }
	        }
	        return decimal;
	    }

	    private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	        if (lastNumber > decimal) {
	            return lastDecimal - decimal;
	        } else {
	            return lastDecimal + decimal;
	        }
	    } 
}
