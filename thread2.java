class kushal implements Runnable
{
public void run()
{
try
{
System.out.println("Thread:"+Thread.currentThread().getId()+" is running");
}

catch(Exception e)
{
System.out.println(e);
}
}
}

class thread2
{
public static void main(String args[])
{
Thread th=new Thread(new kushal());
th.start();
}
}
