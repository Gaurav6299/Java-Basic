class sujit
{
void eat()
{
System.out.println("I am eating");
}

void dance()
{
System.out.println("hello i gonna dance");
}
}

class  gaurav extends sujit
{
void eat()
{
System.out.println("i am eating in child");
}

void dance()
{
System.out.println("i am doing dance");
}
}

class RunTime
{
public static void main(String args[])
{
gaurav g=new gaurav();
g.dance();
sujit s=new sujit();
s.dance();
}
}