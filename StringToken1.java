import java.util.*;
class StringToken1
{
public static void main(String args[])
{
StringTokenizer st1=new StringTokenizer("gaurav:sujit:kumar:vikash",":");
int k=st1.countTokens();
System.out.println("Number of token is:"+k);
for(int i=0;i<k;i++)
{
System.out.println("tokens at ["+i+"] is " +st1.nextToken());
}
}
}