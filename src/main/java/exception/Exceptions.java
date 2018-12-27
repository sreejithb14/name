
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

<<<<<<< HEAD
			System.out.println("conflict testing...");
			System.out.println("conflict testing...");
			System.out.println("conflict testing..123.");
			System.out.println("hello");
||||||| merged common ancestors
			System.out.println("conflict testing...");
			System.out.println("conflict testing...");
			System.out.println("conflict testing..123.");
=======
>>>>>>> be37786ec2168dc70d256511cd2c29d99b5b2c69

		}
	}
}



