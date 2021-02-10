import java.util.*;
class Sender
{
void Send(String msg)
{
System.out.println(msg+" Sending....");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println("Error:");
}
System.out.println(msg+".... Sent");
}
}

class ThreadStuff extends Thread
{
String msg;
Sender sender;

ThreadStuff(String msg,Sender sender)
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

class synchro2
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
Sender snd=new Sender();
for(int i=0;i<4;i++)
{
System.out.println("What you wanna to send?");
String s=sc.nextLine();
ThreadStuff t=new ThreadStuff(s,snd);
t.start();
t.join();
System.out.println();
}

}
}