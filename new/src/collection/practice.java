package collection;

import java.io.ObjectInputStream.GetField;
import java.security.KeyStore.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class practice {

	static TreeMap<Integer, String> map = new TreeMap<Integer, String>();// Stores Roman Variable
	static int firstOperandValue, secondOperanValue;
	
	
	//Returns integer according to roman value
	public static int getNumberValue(String firstOperand){
		int s = 0;
		   for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
	            if (entry.getValue().equals(firstOperand)) 
	            {
	                s=entry.getKey();
	            }
	        }
		   return s;
	}
	
	//returns string according to integer
	public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
	
	
	public static void main(String[] args) {

		int sum;
		Scanner in=new Scanner(System.in);
		//Initialise Map
		    map.put(1000, "M");
	        map.put(900, "CM");
	        map.put(500, "D");
	        map.put(400, "CD");
	        map.put(100, "C");
	        map.put(90, "XC");
	        map.put(50, "L");
	        map.put(40, "XL");
	        map.put(10, "X");
	        map.put(9, "IX");
	        map.put(5, "V");
	        map.put(4, "IV");
	        map.put(1, "I");

	    //Input from user
	    System.out.println("Enter the Roman Numerals: ");    
	    String romanNumerals=in.nextLine();
		String roman[]=romanNumerals.split(" ");// split to get 1st operand and 2nd operand
		
		String firstOperand[]=roman[0].split("");//if 1st operand contains mix of roman number, divide them
		int next,current;
		 if(firstOperand.length>1){
			   for(int i=0;i<firstOperand.length;i+=2){
				   current=getNumberValue(firstOperand[i]);
				   if((firstOperand.length-1)==i)
					   next=0;
				   else
					   next=getNumberValue(firstOperand[i+1]);
				   if(current>=next)
					   firstOperandValue+=current+next;
				   else
					   firstOperandValue+=next-current;
			   }
			   
		   }else{
			   firstOperandValue=getNumberValue(firstOperand[0]);
		   }
		 
		 
		 String secondOperand[]=roman[2].split("");//if 2nd operand contains mix of roman number, divide them
		 if(secondOperand.length>1){
			   for(int i=0;i<secondOperand.length;i+=2){
				   current=getNumberValue(secondOperand[i]);
				   if((secondOperand.length-1)==i)
					   next=0;
				   else
					   next=getNumberValue(secondOperand[i+1]);
				   if(current>=next)
					   secondOperanValue+=current+next;
				   else
					   secondOperanValue+=next-current;
			   }
			   
		   }else{
			   secondOperanValue=getNumberValue(secondOperand[0]);
		   }
		 
		
		if(roman[1].equals("+")){
			System.out.print(toRoman(firstOperandValue+secondOperanValue));
		}else if(roman[1].equals("-")){
			System.out.print(toRoman(firstOperandValue-secondOperanValue));
		}else if(roman[1].equals("*")){
			System.out.print(toRoman(firstOperandValue*secondOperanValue));
		}else if(roman[1].equals("/")){
			System.out.print(toRoman(firstOperandValue/secondOperanValue));
		}else{
			System.out.print("Invalid Operator");
			System.exit(0);
			
		}
	}
	
	
	

}
