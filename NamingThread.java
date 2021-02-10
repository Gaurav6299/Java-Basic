class kushal extends Thread
{
kushal(String name)
{
super(name);
}

public void run()
{
System.out.println("I run very Fast");
}
}

class NamingThread 
{
public static void main(String args[])
{
kushal k=new kushal("gaurav");
kushal k1=new kushal("kushal");
kushal k2=new kushal("sujit");
System.out.println("Thread name is:"+k.getName());
System.out.println("New Name is:"+k1.getName());
System.out.println("Hello kumar:"+k2.getName());
k.start();
}
}