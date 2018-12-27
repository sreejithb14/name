
package exception;

import java.io.IOException;

public class Exceptions {
	public  void foo() throws Throwable   {
			int a =5/0;
			throw new  Exception();
		
	}
	public static void main(String args[])  /*throws Exception*/  {
		try{

			System.out.println("hello....sreejithee.....how are you  ");
			new Exceptions().foo();
			new Exceptions().foo();
			System.out.println("hello sreejith how do you do");
		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("conflict testing...");
			System.out.println("conflict testing...");
			System.out.println("conflict testing..123.");
			System.out.println("conflict testing..123....i am going to make a conflict..");

			
			
			

		}
	}
}



