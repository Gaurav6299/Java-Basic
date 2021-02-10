class gaurav extends Thread
{
public void run()
{
try
{
System.out.println("Hello "+Thread.currentThread().getId());
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

class MainThread
{
public static void main(String args[])
{
gaurav g=new gaurav();
for(int i=0;i<3;i++)
{
g.run();
}
}
}