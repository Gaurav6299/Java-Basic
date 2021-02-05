class simple implements Runnable
{
public void run()
{
Thread t=Thread.currentThread();
System.out.println("Current thread is:"+t.getName());
System.out.println("isAlive:"+t.isAlive());
}
public static void main(String args[]) throws Exception
{
simple s=new simple();
Thread t=new Thread(s);
t.start();

t.join(2000); //wait for thread.
System.out.println("join the thread");
System.out.println(t.getName());
System.out.println(t.isAlive());
}
}