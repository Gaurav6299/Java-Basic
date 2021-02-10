import java.util.*;
class ThreadMain1
{
public static void main(String arg[])
{
System.out.println("\n========================Here I am  handle two Thread communication, Producer and Consumer are Communicate with each About their Product==================="); 
company c=new company();
Thread t1=new Thread(new Runnable()
{
int i=1;
public void run()
{
while(i<5)
{
try
{
c.producer();
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
int i=1;
public void run()
{
while(i<5)
{
try
{
c.consumer();
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
}

class company
{
Scanner sc=new Scanner(System.in);
String s;
public void producer()throws Exception
{
synchronized(this)
{
System.out.println("\nProducer is started.....");
Thread.sleep(600);
System.out.println("What you want to produce");
s=sc.nextLine();
System.out.println("You are produced...."+s);
wait();
}
}
void consumer() throws Exception
{
Thread.sleep(1000);
synchronized(this)
{
System.out.println("Consumer is started....");
Thread.sleep(600);
System.out.println("Do you want to consumed, press... YES/NO");
String k=sc.nextLine();
if(k.toLowerCase().equals("yes"))
{
System.out.println("You are consumed.."+s);
notify();
Thread.sleep(2000);
}
else
{
System.out.println("You are not producing anything");
notify();
Thread.sleep(2000);
}
}

}
}
