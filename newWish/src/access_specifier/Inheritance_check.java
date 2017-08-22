package access_specifier;


class A{
protected void aProtected(){
		
	}
	
	private void aPrivate(){
		
	}
	
	public void aPublic(){
		
	}
	void aDefault(){
		
	}
}
public class Inheritance_check extends A {

	public static void main(String[] args) {

		Inheritance_check obj=new Inheritance_check();
		obj.aDefault();
		obj.aProtected();
		obj.aPublic();
	}

}
