
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
			System.out.println("conflict testing..123....i am going to make a conflict..");
<<<<<<< c24918be7850591e9f9facdae7e9e4072477659b
||||||| merged common ancestors


			System.out.println("conflict testing...");
			System.out.println("conflict testing...");
			System.out.println("conflict testing..123.");
			System.out.println("hello");

	

=======


			System.out.println("conflict testing...");
			System.out.println("conflict testing...");
			System.out.println("conflict testing..123.");
			System.out.println("hello1");

	

>>>>>>> 1
		}
	}
}



