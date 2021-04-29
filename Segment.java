class Segment
{
static int countNumber(String s)
{
if(s==null || s.trim().length()==0)
return 0;

String str[]=s.trim().split("\\s+[,&]");
return str.length;
}
public static void main(String args[])
{
String s="Haii,dud how are you";
System.out.println(countNumber(s));
}
}