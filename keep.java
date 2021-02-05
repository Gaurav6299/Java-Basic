class keep extends Thread
{
public static void main(String args[])
{
Thread t1=Thread.currentThread();
System.out.println("current thread is:"+t1.getName());
System.out.println("Priority is:"+t1.getPriority());
t1.setPriority(MAX_PRIORITY);
System.out.println("max priority is:"+t1.getPriority());
t1.setName("kushal");
System.out.println("after change:"+t1.getName());

childthread c=new childthread();
System.out.println("child prority is:"+c.getPriority());
c.setPriority(MIN_PRIORITY);
System.out.println("Child priority is:"+c.getPriority());
c.start();
}
}

class childthread extends Thread
{
public void run()
{
System.out.println("child thread");
}

}