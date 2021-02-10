import java.util.*;
import java.util.concurrent.*;
import java.text.*;
class Task implements Runnable
{
String name;
Task(String name)
{
this.name=name;
}

public void run()
{
try
{
for(int i=0;i<=5;i++)
{
if(i==0)
{
Date d=new Date();
SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
System.out.println("Initialization time for task name="+name+"=" +ft.format(d));
}
else
{
Date d=new Date();
SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
System.out.println("Exceuting time for task name " +name+ " "+ ft.format(d));
}
Thread.sleep(1000);
}
System.out.println(name+" complete");
}

catch(InterruptedException e)
{
e.printStackTrace();
}
}
}

class task
{
static int MAX_T=3;
public static void main(String args[])
{
Runnable t1=new Task("task 1");
Runnable t2=new Task("task 2");
Runnable t3=new Task("task 3");
Runnable t4=new Task("task4");
Runnable t5=new Task("task 5");

ExecutorService pool=Executors.newFixedThreadPool(MAX_T);

pool.execute(t1);
pool.execute(t2);
pool.execute(t3);
pool.execute(t4);
pool.execute(t5);

pool.shutdown();
}
} 

 