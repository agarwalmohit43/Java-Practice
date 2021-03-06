package after;

import java.util.*;

import DataStructure.arrayinsert;
class PhoneFeatures{
	private String os;
	private String brand;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
public class Phone {
	
	static ArrayList<PhoneFeatures> arrayList;
	
	public static void main(String[] args){
		
		arrayList = new ArrayList();
		
		PhoneFeatures samsung=new PhoneFeatures();
		samsung.setBrand("Samsung");
		samsung.setOs("Android");
		
		PhoneFeatures iphone = new PhoneFeatures();
		iphone.setBrand("Apple");
		iphone.setOs("ios");
		
		arrayList.add(samsung);
		arrayList.add(iphone);
		
		display(arrayList);
		display();
		
	}

	private static void display() {
		for(int i=0;i<arrayList.size();i++){
			System.out.println("Phone Brand: "+arrayList.get(i).getBrand());
			System.out.println("Phone OS: "+arrayList.get(i).getOs());
			System.out.println();
		}
	}

	private static void display(ArrayList<PhoneFeatures> arrayList2) {
		for(int i=0;i<arrayList2.size();i++){
			System.out.println("Phone Brand: "+arrayList2.get(i).getBrand());
			System.out.println("Phone OS: "+arrayList2.get(i).getOs());
			System.out.println();
		}
	}

}
