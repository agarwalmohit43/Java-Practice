package exception;

import java.io.IOException;  
  
   


public class throwss {

	 void m()throws IOException{  
		 
		    throw new IOException("device error");//checked exception  
		  }  
		  void n()throws IOException{
			  
		    m();  
		  }  
		  void p(){
 
		   try{ 
			   
		    n();
		    
		   }catch(Exception e){
			   
			   e.printStackTrace();}  
		  }
	
	
	public static void main(String[] args) {

		throwss obj=new throwss();
		obj.p();
	}

}
