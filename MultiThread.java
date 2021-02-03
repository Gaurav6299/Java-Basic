class gaurav extends Thread
{
public void run()
{
try
{
System.out.println("Thread :"+Thread.currentThread().getId()+ " is running");
}
catch(Exception e)
{
System.out.println(e);
}

}
}

class MultiThread
{
public static void main(String args[])
{
int n=4;
for(int i=0;i<n;i++)
{
gaurav g=new gaurav();
g.start();
}

}
}