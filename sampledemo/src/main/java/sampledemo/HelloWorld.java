package sampledemo;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Hello World! How are you doing");
		int[] arr= {23,45,56};
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("Summation:" + sum);

	}

}
