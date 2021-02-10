import java.util.*;
class Sender
{
public void Send(String msg) 
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
sender.Send(msg);
}
}
}

class synchro1
{
public static void main(String args[]) throws Exception
{
Scanner sc=new Scanner(System.in);

Sender snd=new Sender();
for(int i=0;i<4;i++)
{
System.out.println("What you wanna to send");
String s=sc.nextLine();
ThreadSend t=new ThreadSend(s,snd);
t.start();
t.join();
System.out.println();
}
}
}
