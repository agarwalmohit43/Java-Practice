package check;

public class oneDimensional {

	public static void main(String[] args) {

	    int[] arr1 =new int[3];
		int[] arr2 = new int[3];
		int[] arr3  =new int[3];
		int[] arr4  =new int[3];
	
		int[] arr={10,2,3,1,5,15,20,12,36,14,78,75};
		
		int size= arr.length/4;
		
		System.out.print(size+" -> Size\n");
		for(int i=0;i<arr.length;i++){
			
			if(i<=2)
			{
				arr1[i]=arr[i];
				
			}else if(i>2 && i<=5 )
			{
				arr2[i-3]=arr[i];
			}else if(i>5 && i<=8 ){
				arr3[i-6]=arr[i];
			}else{
				arr4[i-9]=arr[i];
			}
		}
		
		
		
		for(int arrs:arr1){
			System.out.println(arrs);
		}
		
		System.out.println();
		for(int arrs:arr2){
			System.out.println(arrs);
		}
		System.out.println();
		for(int arrs:arr3){
			System.out.println(arrs);
		}
		System.out.println();
		for(int arrs:arr4){
			System.out.println(arrs);
		}
	}

}
