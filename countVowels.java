class countVowels
{
public static void main(String args[])
{
String s="Gaurav";
int count=0;
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||
s.charAt(i)=='u')
{
count+=1;
}
}
System.out.println(count);
}
}