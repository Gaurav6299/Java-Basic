class gaurav implements Runnable
{
public void run()
{
try
{
System.out.println("Good morning "+Thread.currentThread().getId());
}
catch(Exception e)
{
System.out.println(e);
}
}
}

class MainThread1
{
public static void main(String args[])
{
gaurav g=new gaurav();
g.run();
}
}