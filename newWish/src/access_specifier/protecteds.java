package access_specifier;

public class protecteds extends java.lang.Object {

	protected void aProtected(){
		
	}
	
	private void aPrivate(){
		
	}
	
	public void aPublic(){
		
	}
	
	void aDefault(){
		
	}
	
	public static void main(String[] args) {

		protecteds obj=new protecteds();
		obj.aDefault();
		obj.aPrivate();
		obj.aProtected();
		obj.aPublic();
	}

}
