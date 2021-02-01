import java.util.*;
class convertLinked
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,3};
Set<Integer> s=new LinkedHashSet<>();
for(int i:a)
{
s.add(i);
}
System.out.println("LinkedHashSet is:"+s);
}
}