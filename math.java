package calc;
import java.util.regex.*;  

public class math {
	public int Add (String a, String b)
	{
		int[] pair = checker(a,b);
        return pair[0] + pair[1];
	}

	public int Subtract (String a, String b)
	{
		int[] pair = checker(a,b);
        return pair[0] - pair[1];
	}

	public int Multiply (String a, String b)
	{
		int[] pair = checker(a,b);
        return pair[0] * pair[1];
	}

	public String Divide (String a, String b)
	{
		int[] pair = checker(a,b);
		
        float rez = (float) pair[0] / pair[1];
        
        return Float.toString(rez)  ;
	}
	
	private static int[] checker(String a,String b){
		int[] pair = {0,0};
		
		if(Pattern.matches("\\d+", a)&&Pattern.matches("\\d+", b) ){
			pair[0] = Integer.parseInt(a);
			pair[1] = Integer.parseInt(b);
			if ((pair[0] >0)&&(pair[0] < 11)&&(pair[1] >0)&&(pair[1] < 11))
			return pair;
			else {throw new ArithmeticException("Неверная операция");}
		}
		
		pair[0] = rimtodigit(a) ;
		pair[1] = rimtodigit(b) ;
		
		return pair;
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
