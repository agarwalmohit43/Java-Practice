package check;

class checkOverride{
	public double  mohit(){
		return 0;
		
	}
	public int  mohit1(){
		return 0;
		
	}
}
public class OverrideConceptClear extends checkOverride {

	
	public double  mohit(){
		System.out.print("Check");
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkOverride obj = new OverrideConceptClear();
		obj.mohit();
		obj.mohit1();
	}

}
