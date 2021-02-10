class human extends Thread
{
public void run()
{
System.out.println("Hello,"+Thread.currentThread().getName());
}
}

class Main
{
public static void main(String args[])
{
human h=new human();
h.start();
try
{
h.join(1000);
System.out.println("Hello whatever  is present");
}
catch(Exception e)
{
System.out.println("EXception");
}


}
}