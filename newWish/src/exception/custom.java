package exception;
class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}

public class custom {

	public static void main(String[] args) {

		try{
		validate(19);
		}catch(Exception m){
			System.out.println("Exception occured"+m);
		}
	}

	private static void validate(int i)throws InvalidAgeException {

		if(i<18){
			throw new InvalidAgeException("Exception String");
		}else{
			System.out.println("Fine");
		}
	}

}
