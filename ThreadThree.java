import java.util.*;
class ThreadThree
{
public static void main(String args[])
{
company c=new company();
Thread t1=new Thread(new Runnable()
{
public void run()
{
int i=1;
while(i<5)
{
try
{
c.produce();
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
String s;
void produce()throws Exception
{
Scanner sc=new Scanner(System.in);
synchronized(this)
{
System.out.println("producer is start...What u wanna to produce");
s=sc.next();
System.out.println("You are produced :"+s);
wait();
}
}

void consumer() throws Exception
{
Thread.sleep(1000);
String k;
Scanner sc=new Scanner(System.in);
synchronized(this)
{
System.out.println("consumer start...Want your permission to running..");
k=sc.nextLine();
if(k.equals("yes"))
{
System.out.println("You are consumed :"+s);
notify();
Thread.sleep(2000);
}
else
{
System.out.println("You are not consumed anything...");
notify();
Thread.sleep(2000);
}

}
}
}
