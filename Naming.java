class kumar extends Thread
{
kumar(String name)
{
super(name);
}
public void run()
{
System.out.println("Hello run! what can i do for you");
}
}

class Naming
{
public static void main(String args[])
{
kumar k=new kumar("gaurav");
kumar k1=new kumar("sujit");
System.out.println("New Thread name is :"+k1.getName());
System.out.println("Thread name is:"+k.getName());
k.start();
}
}