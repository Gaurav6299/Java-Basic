class thread implements Runnable
{
public void run()
{
Thread t=Thread.currentThread();
System.out.println("Hello team whats going on");
System.out.println(t.getName());
System.out.println("Is Alive:"+t.isAlive());
}
}

class ThreadOp4
{
public static void main(String args[]) throws Exception
{
thread t=new thread();
Thread t1=new Thread(t);
t1.start();

t1.join(1000);
System.out.println("Join the thread after 1s");
System.out.println(t1.getName());
System.out.println(t1.isAlive());

}
}