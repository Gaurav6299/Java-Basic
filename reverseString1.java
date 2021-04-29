class reverseString1
{
static String reverse(String s)
{
if(s==null || s.length<=1)
{
return s;
}

return reverse(s.substring(1))+s.charAt(0);
}
public static void main(String args[])
{
String s="gaurav";
System.out.println(reverse(s));
}
}