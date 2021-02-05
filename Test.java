class Test extends Thread
{
public static void main(String args[])
{
Thread t=Thread.currentThread();
System.out.println("Current thread is:"+t.getName());
t.setName("gaurav");
System.out.println("After chnage the name:"+t.getName());
System.out.println("Priority is:"+t.getPriority());
t.setPriority(MAX_PRIORITY);
System.out.println("After change priority:"+t.getPriority());

ChildThread t1=new ChildThread();
System.out.println("Child thread is:"+t1.getName());
System.out.println("Child priority is:"+t1.getPriority());
t1.setPriority(MIN_PRIORITY);
System.out.println("Min priority is:"+t1.getPriority());
t1.start();
}
}

class ChildThread extends Thread
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("Main thread");
}
}
}