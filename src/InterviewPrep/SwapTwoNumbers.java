package InterviewPrep;

public class SwapTwoNumbers {

	public static void main(String[] args) {

	//	withTempVariable(10, 100);
		withoutTemp(10,100);

	}

	public static void withTempVariable(int a, int b) {

		System.out.println("a is : " + a + " b is : " + b);

		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("a is : " + a + " b is : " + b);

	}

	public static void withoutTemp(int a, int b) {

		System.out.println("a is : " + a + " b is : " + b);

		/*a=a-b;
		b=a+b;
		a=b-a;*/
		
		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println("a is : " + a + " b is : " + b);

	}
}
