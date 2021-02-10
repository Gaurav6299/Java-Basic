class gaurav
{
String name;
int roll;
void getValue(String name,int roll)
{
synchronized(this)
{
this.name=name;
this.roll=roll;
}
System.out.println("Hello gaurav how can i help you");
}
}

class value1
{
public static void main(String args[])
{
gaurav g=new gaurav();
g.getValue("Ankit",13);
System.out.println(g.name);
System.out.println(g.roll);
}
}