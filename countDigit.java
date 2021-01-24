class countDigit
{
public static void main(String args[])
{
String s="gaurav23";
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)>=48 && s.charAt(i)<=57)
{
count+=1;
}
}
System.out.println("the total number of digit digit is:"+count);
}
}