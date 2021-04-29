import java.util.*;
class CountVowels1
{
public static void main(String args[])
{
String s="Gaurav";
List<Character> vo=new ArrayList<>();
vo.add('a');
vo.add('e');
vo.add('i');
vo.add('o');
vo.add('u');
char c[]=s.toCharArray();
int co=0;
int v=0;
for(int i=0;i<c.length;i++)
{
if(vo.contains(c[i]))
{
v++;
}
else
{
co++;
}
}
System.out.println("the vowels is:"+v+"\n and consonants is:"+co);
}
}