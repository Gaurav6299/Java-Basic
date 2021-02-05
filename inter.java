interface one
{
public void run();
}

interface two
{
public void read();
}

class sujit implements one,two
{
public void run()
{
System.out.println("I am doing my work");
}

public void read()
{
System.out.println("I am walking");
}
}

class inter
{
public static void main(String args[])
{
sujit s=new sujit();
s.run();
s.read();

}
}