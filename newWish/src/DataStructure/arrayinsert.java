package DataStructure;

public class arrayinsert {

	public static void main(String[] args) {

		int arr[]={1,2,3,5,4,7,0};
		int k=4,n=6,j=0,i=0,item=10;
		
		
		for(i=6;i>=k;i--){
			arr[i]=arr[i-1];
		}
		arr[k-1]=item;
		
		for(int m=0;m<7;m++){
			System.out.println(arr[m]);
		}
		
		
	}

}
