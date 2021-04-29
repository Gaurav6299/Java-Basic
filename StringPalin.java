class StringPalin
{
static boolean checkPalin(String s)
{
s=s.toLowerCase();
boolean f=false;
int i=0;
int j=s.length()-1;
while(i<=j)
{
if(s.charAt(i)==s.charAt(j))
{
i++;
j--;
f=true;
}
else
{
return f;
}
}
return f;
}
public static void main(String args[])
{
String s="MaDam";
if(checkPalin(s))
{
System.out.println("The String is palindrome:");
}
else
{
System.out.println("Not palindrome:");
}
}
}