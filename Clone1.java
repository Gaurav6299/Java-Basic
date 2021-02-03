class Clone1 implements Cloneable
{
protected Object clone() throws CloneNotSupportedException
{
return super.clone();
}
String name="gaurav";
public static void main(String args[])
{
Clone1 x=new Clone1();
try
{
Clone1 y=(Clone1)x.clone();
System.out.println(y.name);
}
catch(CloneNotSupportedException e)
{
e.printStackTrace();
}

}
}