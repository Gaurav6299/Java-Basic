class MyThread extends Thread
{
public void run()
{
System.out.println("Hello run whats going on");
}
}

class ThreadOp1
{
public static void main(String args[])
{
MyThread t=new MyThread();
t.start();
for(int i=0;i<2;i++)
{
Thread.yield();
System.out.println(Thread.currentThread().getName()+" in control");
}
}
}
