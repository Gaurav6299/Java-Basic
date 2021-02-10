class thread
{
void getValue()
{
for(int i=0;i<3;i++)
{
System.out.println(i);
try
{
Thread.sleep(500);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
}

class ThreadSyn extends Thread
{
thread t;
ThreadSyn(thread t)
{
this.t=t;
}
public void run()
{
t.getValue();
}
}

class SynValue
{
public static void main(String args[])
{
thread t=new thread();
ThreadSyn t1=new ThreadSyn(t);
ThreadSyn t2=new ThreadSyn(t);
t1.start();
t2.start();
}
}