class Object2
{
public static void main(String args[])
{
Object o=new String("kumar gaurav"); 
Class c=o.getClass();
System.out.println(c.getName());

Object y=new String("123");
System.out.println(y);

y=123;
Class c1=y.getClass();
System.out.println(c1.getName());

y="i love you";
Class c2=y.getClass();
System.out.println(c2);
System.out.println(c2.getName());
}
}