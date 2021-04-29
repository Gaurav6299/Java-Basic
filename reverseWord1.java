import java.util.*;
class reverseWord1
{
public static void main(String args[])
{
String s="gaurav";
Set<Character> set=new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
set.add(s.charAt(i));
}

String h="";
for(Character k:set)
{
h+=k;
}

System.out.println("after remove duplicate:-"+h);
}
}
