class thread extends Thread
{
public void run()
{
for(int i=0;i<2;i++)
{
System.out.println("Hello Thread-1");
}
}
}

class ThreadOp
{
public static void main(String args[])
{
thread t=new thread();
t.start();
for(int i=0;i<2;i++)
{
Thread.yield();
System.out.println("Hello yeild thread");
}
}
}