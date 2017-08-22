package exception;

public class throwexception {

	public static void main(String[] args) {

		validate(17);
		System.out.println("Rest of the code");
	}

	private static void validate(int i) {
		
		if(i<18){
			throw new ArithmeticException("Under Age");
		}else{
			System.out.println("Cool ready to vote");
		}
		
	}

}
