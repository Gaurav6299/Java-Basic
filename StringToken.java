import java.util.*;
class StringToken
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("hello how are you"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}

StringTokenizer st1=new StringTokenizer("Hello:kumar:how:are:you",":");
System.out.println("Second token is:");
while(st1.hasMoreTokens())
{
System.out.println(st1.nextToken());
}

StringTokenizer st2=new StringTokenizer("java:python:javascript:",":",true);
System.out.println("the third StringTokenizer is:");
System.out.println(st2.countTokens());
while(st2.hasMoreTokens())
{
System.out.println(st2.nextToken());
}

}
}