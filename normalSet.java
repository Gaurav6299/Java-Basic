import java.util.*;
class normalSet
{
public static void main(String args[])
{
Set<Integer> s=new HashSet<>();
s.addAll(Arrays.asList(new Integer[]{1,2,3,4}));
System.out.println(s);

Set<Integer> s1=new HashSet<>();
s1.addAll(Arrays.asList(new Integer[]{2,1,4,5,6}));
System.out.println("The set is:"+s1);

Set<String> s2=new HashSet<>();
s2.addAll(Arrays.asList(new String[]{"gaurav","kushal","kumar","sujit"}));
System.out.println("the set  is:"+s2);
s2.remove("kushal");
System.out.println("the set is :"+s2);
s2.remove("sujit");
System.out.println("the set is:"+s2);

Iterator i=s.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
System.out.println("Iterating in another way:");
for(Integer in:s1)
{
System.out.println(in);
}
}
}