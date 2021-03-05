class Clone12 implements Cloneable
{
protected Object clone() throws CloneNotSupportedException
{
return super.clone();
}

String name="gaurav";
public static void main(String args[])
{
Clone12 c=new Clone12();
try
{
Clone12 c2=(Clone12)c.clone();
System.out.println(c2.name);
}
catch(Exception e)
{
e.printStackTrace();
}


}
}