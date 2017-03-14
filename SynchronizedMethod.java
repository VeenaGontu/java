public class SynchronizedMethod extends Thread 
//public class SynchronizedMethod implements Runnable
{
	public void run()
	{
		ShowValues();
	}
	public synchronized void ShowValues()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
			   System.out.println(i);
			   Thread.sleep(100);
			}
			catch(Exception ex)
			{
				
			}
		}
	}
    public static void main(String args[])
    {
    	SynchronizedMethod sm=new SynchronizedMethod();
    	Thread t1=new Thread(sm);
    	Thread t2=new Thread(sm);
    	t1.start();
    	t2.start();
    }
}
