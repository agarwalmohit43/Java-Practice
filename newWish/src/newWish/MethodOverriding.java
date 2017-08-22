package newWish;

abstract class Banking{
	abstract float getRateOfInterest();
}

class SBI extends Banking{
	float getRateOfInterest(){return (float) 8.5;
	}
}

class ICICI extends Banking{
	float getRateOfInterest(){return (float) 7.5;
	}
}
class HDFC extends Banking{
	float getRateOfInterest(){return (float) 9.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Banking b;
		b=new SBI();
		System.out.println("SBI Rate of interest: "+b.getRateOfInterest());
		
		b=new ICICI();
		System.out.println("ICICI Rate of interest: "+b.getRateOfInterest());
		
		b=new HDFC();
		System.out.println("HDFC Rate of interest: "+b.getRateOfInterest());
	}

}
