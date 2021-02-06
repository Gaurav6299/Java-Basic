import java.util.*;
class ThreadMe
{
public static void main(String args[]) throws Exception
{
PC pc=new PC();
Thread t1=new Thread(new Runnable()
{
public void run()
{
try
{
pc.produce();
}
catch(Exception e)
{
e.printStackTrace();
}
}
});

Thread t2=new Thread(new Runnable()
{
public void run()
{
try
{
pc.consumer();
}
catch(Exception e)
{
e.printStackTrace();
}
}
});

t1.start();
t2.start();


}

static class PC
{
void produce() throws Exception
{
synchronized(this)
{
System.out.println("Producer thread is running...");
wait();
System.out.println("Resumed..");

}
}

void consumer()throws Exception
{
Thread.sleep(1000);
Scanner sc=new Scanner(System.in);
synchronized(this)
{
System.out.println("Waiting for return key...");
sc.nextLine();
System.out.println("Return key...");
notify();
Thread.sleep(2000);
}
}
}
}