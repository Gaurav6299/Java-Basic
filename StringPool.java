class StringPool
{
public static void main(String args[])
{
String s1="gaurav";
String s2="gaurav";
System.out.println(s1.equals(s2));
System.out.println(s1==s2);

String s3=new String("kushal");
String s4=new String("kushal"); 
System.out.println(s3.equals(s4));
System.out.println(s3==s4);

System.out.println(s3.compareTo(s2));
}
}