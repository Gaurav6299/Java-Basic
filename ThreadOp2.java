class MyThread implements Runnable
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}

}

}
}
class ThreadOp2
{
public static void main(String args[]) throws Exception
{
MyThread t1=new MyThread();
Thread t2=new Thread(t1);
t2.start();

Thread.sleep(1000);
System.out.println("Start Another Thread.........");
Thread t3=new Thread(t1);
t3.start();
}
}