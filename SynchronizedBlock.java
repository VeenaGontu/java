public class SynchronizedBlock extends Thread 
{
	public void run()
	{
		synchronized(this)
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
	}
    public static void main(String args[])
    {
    	SynchronizedBlock sb=new SynchronizedBlock();
    	Thread t1=new Thread(sb);
    	Thread t2=new Thread(sb);
    	t1.start();
    	t2.start();
    }
}
