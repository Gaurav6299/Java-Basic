class sujit1 extends Thread
{
public void run()
{
System.out.println("hello kumar");
}

public static void main(String args[])
{
Thread t=Thread.currentThread();
sujit1 s=new sujit1();
sujit1 s1=new sujit1();
System.out.println(s.getPriority());
System.out.println(s1.getPriority());
s.start();
System.out.println(t.getName());
s.setPriority(10);
System.out.println(s.getPriority());
s1.setPriority(MIN_PRIORITY);
System.out.println(s1.getPriority());
s.setPriority(MAX_PRIORITY);
System.out.println(s.getPriority());
}
}
