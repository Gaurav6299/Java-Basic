//count the number of occurrence of a given character in a string
class Occurrence
{
public static void main(String args[])
{
String s="gaurav";
char c='a';
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==c)
{
count++;
}
}
System.out.println("Number of occurrence of given character:"+count);
}
}