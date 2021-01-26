import java.util.*;
class convertSet1
{
static void convertToSet(String s[])
{
Set<String> set=new HashSet<>();
Collections.addAll(set,s);
System.out.println("the set is:"+set);

}
public static void main(String args[])
{
String s[]={"kushal","kumar","sujit","hello"};
convertToSet(s);
}
}