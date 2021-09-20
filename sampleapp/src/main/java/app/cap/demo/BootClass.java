package app.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello!from java world");
		show();
 
	}
	public static void show() {
		int[] arr= {90,23,40};
		int sum=0;
		for(int n:arr) {
		    System.out.println(n);
		
		
		}
		System.out.println("show");
	}

}
