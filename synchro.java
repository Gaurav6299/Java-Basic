class Sender
{
public void send(String msg)
{
System.out.println("Sending..."+msg);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println("Exception occur");
}
System.out.println(msg+" Sent");
}
}

class ThreadSend extends Thread
{
String msg;
Sender sender;
ThreadSend(String msg,Sender sender)
{
this.msg=msg;
this.sender=sender;
}

public void run()
{
synchronized(sender)
{
sender.send(msg);
}
}
}

class synchro
{
public static void main(String args[])
{
Sender sd=new Sender();
ThreadSend t=new ThreadSend("hiii",sd);
t.start();
}
}