package check;

class one{
	public static void change(two obj,double money){
		obj.setBal(money);
	}
}

class two{
	private double bal;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal += bal;
	}
	
}

public class ObjectChangingValue {

	public static void main(String[] args) {
		two obj=new two();
		obj.setBal(100.0);
		one.change(obj, 10.0);
		System.out.println(obj.getBal());
	}

}
