import java.util.*;
class FindSubsequence
{
static ArrayList<String> l=new ArrayList<>();
static void find(String s,String ans)
{
if(s.length()==0)
{
l.add(ans);
return;
}

find(s.substring(1),ans+s.charAt(0));
find(s.substring(1),ans);
}
public static void main(String args[])
{
String s="ram";
find(s,"");
System.out.println(l);
}
}