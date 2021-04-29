class Buffer12
{
public static void main(String args[])
{
StringBuffer s=new StringBuffer("kumar gaurav");
s.delete(0,4);
System.out.println(s);

StringBuffer s1=new StringBuffer("sujit");
s1.deleteCharAt(2);
s1.deleteCharAt(3);
s1.deleteCharAt(0);
System.out.println(s1);

StringBuffer s3=new StringBuffer("kushal");
s3.deleteCharAt(3);
s3.deleteCharAt(2);
System.out.println(s3);
}
}