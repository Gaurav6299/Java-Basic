class sujit extends Thread
{
public void run()
{
try
{
System.out.println("thread:"+Thread.currentThread().getId()+" is running");
}

catch(Exception e)
{
System.out.println(e);
}
}
}

class thread1
{
public static void main(String args[])
{
sujit s=new sujit();
s.start();
sujit s1=new sujit();
s1.start();
}
}