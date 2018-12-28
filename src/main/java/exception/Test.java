package exception;

public class Test {
	public static void fun() {
		try {
			int a=0;
			System.out.println(3/a);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
