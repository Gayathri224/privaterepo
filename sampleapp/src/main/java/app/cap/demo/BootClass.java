package app.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello!from java world");
		show();
 
	}
	public static void show() {
		int[] arr= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int n:arr) {
			sum+=n;
		    System.out.println(n);
		
		
		}
		System.out.println("show");
	}

}
