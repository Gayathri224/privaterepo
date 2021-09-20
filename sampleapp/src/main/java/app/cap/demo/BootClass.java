package app.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello!from java world");
		show();
 
	}
	public static void show() {
		int[] arr= {12,30,20,40};
		for(int i=0;i<100;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("show method here!");
	}

}
