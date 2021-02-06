import java.util.*;
class ThreadTwo
{
public static void main(String args[])
{
PC pc=new PC();
Thread t1=new Thread(new Runnable()
{
public void run()
{
int i=1;
while(i<5)
{
try
{
pc.produce();
Thread.sleep(1000);
i++;
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
});

Thread t2=new Thread(new Runnable()
{
public void run()
{
int i=1;
while(i<5)
{
try
{
pc.consumer();
Thread.sleep(1000);
i++;
}
catch(Exception e)
{
e.printStackTrace();
}
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
System.out.println("Producer is start...");
wait();
System.out.println("Consumer Finished...");
}
}

void consumer() throws Exception
{
Thread.sleep(1000);
Scanner sc=new Scanner(System.in);
synchronized(this)
{
System.out.println("Consumer want something from u");
sc.nextLine();
System.out.println("Key Access");
notify();
Thread.sleep(2000);
}
}
}
}
