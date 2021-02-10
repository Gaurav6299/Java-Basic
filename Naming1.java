class sujit extends Thread
{
public void run()
{
System.out.println("Hello sujit! what can i do for u");
System.out.println(Thread.currentThread().getName());
}
}

class Naming1
{
public static void main (String args[])
{
sujit s=new sujit();
s.start();
System.out.println("Thread name is:"+s.getName());
s.setName("geeks");
s.setName("gaurav");
System.out.println("After change, the new Thread is:"+s.getName());
sujit s1=new sujit();
s1.setName("kushal");
System.out.println("My new Thread name is:"+s1.getName());
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getId());
}
}