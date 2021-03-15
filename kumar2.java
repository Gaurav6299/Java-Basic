class sujit
{
void read()
{
System.out.println("Hello i am doing something");
}

void play()
{
System.out.println("I gonna play");
}
}

class gaurav extends sujit
{
void  sleep()
{
System.out.println("I am sleeping");
}
}

class kumar2 extends sujit
{
void dance()
{
System.out.println("Dance is the favourite part of my life");
}
public static void main(String args[])
{
kumar2 k=new kumar2();
k.dance();
}
}