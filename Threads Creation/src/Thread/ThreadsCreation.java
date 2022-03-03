package Thread;

public class ThreadsCreation extends Thread{

		 	public void run()
		 	{
		  		System.out.println("concurrent thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		 		ThreadsCreation mt = new  ThreadsCreation();
		  		mt.start();

	}

}
