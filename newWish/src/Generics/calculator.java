package Generics;

public class calculator {

	public static void main(String[] args) {

		add(5,10);
	}
	
	public static <E> int add(E a,E b){
		if(a instanceof Integer){
			return (int)a+(int)b;
		}
		return 0;
	}

}
