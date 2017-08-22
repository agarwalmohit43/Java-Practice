package Interface;

interface pulsar{
	void speed();
}

interface color{
	void black();
}

public class multipleinheritance implements pulsar,color {

	public static void main(String[] args) {

		multipleinheritance obj=new multipleinheritance();
		obj.black();
		obj.speed();
		
		
	}

	@Override
	public void black() {
		System.out.println("pulsar color is black");
		
	}

	@Override
	public void speed() {
		System.out.println("pulsar is awesome");
		
	}

}
