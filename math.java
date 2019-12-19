public class math {
   public static int rim_mode = 0;
   public static String operation = ""; 
   public static int rezult = 0;
   public static int operand1 =0;
   public static int operand2 =0;

   public task docalculation1(task task) {
	   
	   rim_mode  = task.rim_mode;
       switch(task.operation)
       {
          case "+" :
        	  task.rezult = task.operand1 + task.operand2;
        	 return task;
          case "-" :
        	  task.rezult = task.operand1 - task.operand2; 
        	  return task;
          case "*" :
        	  task.rezult = task.operand1 * task.operand2;
        	  return task;
          case "/" :
        	  task.rezult = task.operand1 / task.operand2;
        	  return task;
          default :
              throw new ArithmeticException("Неверная операция");

       }
   }

}
