class CountConso
{
public static void main(String args[])
{
String s="kushal";
s=s.toLowerCase();
int v=0;
int c=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
{
v++;
}
else
{
c++;
}
}

System.out.println("Vowels="+v+ " and consonants="+c);
}
}
