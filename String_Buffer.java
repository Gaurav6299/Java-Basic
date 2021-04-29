class String_Buffer
{
public static void main(String args[])
{
StringBuffer s=new StringBuffer("kumar");
int k=s.length();
System.out.println(s);
System.out.println(k);
s.append(" gaurav");
System.out.println(s);
s.append(" and sujit kumar");
s.append(1);
s.append(2.5);
System.out.println(s+" Length="+s.length());
}
}