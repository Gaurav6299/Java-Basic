class sujit
{
int x=10;
}

class kushal extends sujit
{
int x=20;
}

class human
{
public static void main(String args[])
{
sujit s=new sujit();
System.out.println(s.x);
kushal k=new kushal();
System.out.println(k.x);
}
}