class Builder2
{
public static void main(String args[])
{
StringBuilder str=new StringBuilder();
str.append("kumar");
str.append("gaurav");
str.append(" sujit");
System.out.println(str.toString());


StringBuilder str2=new StringBuilder(20);
System.out.println(str2.capacity());

StringBuilder str3=new StringBuilder("kushal");
System.out.println(str3.toString());
str3.reverse();
System.out.println(str3.toString());
}
}