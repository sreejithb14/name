
package exception;

import java.io.IOException;

public class Exceptions {
	public  void foo() throws Throwable   {
			int a =5/0;
			throw new  Exception();
		
	}
	public static void main(String args[])  /*throws Exception*/  {
		try{

			new Exceptions().foo();

		}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("conflict testing..123....i am going to make a conflict..123");

		}
	}
}



