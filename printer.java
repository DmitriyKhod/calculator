public class printer {
	   public void print(task task) {
	       if (task.rim_mode == 0)
	       System.out.println(task.rezult);
	       else{
	    	   String romanized = "";
	    	   
	    	   if (task.rezult < 0){
	    		   romanized = "-";
	    		   task.rezult *= -1;
	    	   	}
	    	   
	    	   String roman[] = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	    	   int decimal[] = {100, 90, 50, 40, 10, 9, 5, 4, 1 };
	    	   
    	   
	    	   for (int index = 0; index < decimal.length; index++) {
	    		    while (decimal[index] <= task.rezult) {
	    		      romanized += roman[index];
	    		      task.rezult -= decimal[index];
	    		    }
	    		  }
	    	   
	    	   System.out.println(romanized);
	       }
	   }
}
