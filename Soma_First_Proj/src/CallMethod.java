
public class CallMethod {
	static int myMethod(int a)
	{
		System.out.println("hi 2");

		return 5 + a;	
}

	public static void main(String[] args) {
		
		System.out.println("hi 1");
System.out.println(myMethod(8) );
	}

}
