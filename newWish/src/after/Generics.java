package after;

public class Generics {

	public static void main(String[] args) {

		Integer[] ar = {1,2,3,4,5,6};
		printArray(ar);
		
		
	}
	
	public static <E> void printArray(E[] inputarray){
		
		for( E elements: inputarray){
			System.out.print(elements);
		}
		System.out.println();
	}
	
	

}
