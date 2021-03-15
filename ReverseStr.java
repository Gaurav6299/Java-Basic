class ReverseStr
{
public static void main(String args[])
{
String s="gaurav";
char a[]=s.toCharArray();

for(int i=s.length()-1;i>=0;i--)
{
System.out.print(a[i]);
}
}
}