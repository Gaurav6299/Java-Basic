class MyThread extends Thread
{
public void run()
{
try
{
System.out.println("Hello");
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
MyThread t=new MyThread();
t.start();
}
}
