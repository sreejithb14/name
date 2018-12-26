package exception;

import java.io.IOException;

public class Exceptions {
	public  void foo() throws Throwable   {
			int a =5/0;
			throw new  Exception();
		
	}
	public static void main(String args[])  /*throws Exception*/  {
		try{

			System.out.println("hello.........");
			new Exceptions().foo();
			new Exceptions().foo();
			System.out.println("hello");
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("testing...");
		}
	}
}
