package Chapter1;

public class overloadMain {
	
	public static int value = 100 ; 
	
	public static void main(String arg) {
		System.out.println("public static with String arg ");
	}

	static public void main(String[] ramya) {
		System.out.println("static public with String[] ramya ");
	}

	public static void main(int number) {
		System.out.println("Correct signature with number parameter");
	}
	
	public  void MyClass() {
		System.out.println("Inside the static non main method ");
	}

}
