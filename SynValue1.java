class first
{
synchronized void getValue()
{
for(int i=0;i<5;i++)
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
first f;
ThreadSyn(first f)
{
this.f=f;
}
public void run()
{
f.getValue();
}
}


class SynValue1
{
public static void main(String args[])
{
first f=new first();
ThreadSyn t=new ThreadSyn(f);
ThreadSyn t1=new ThreadSyn(f);
t.start();
t1.start();
}
}
