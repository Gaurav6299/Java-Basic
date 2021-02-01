import java.util.*;
class removeDup
{
public static void main(String args[])
{
int a[]={1,2,3,1,2};
Set<Integer> s=new HashSet<>();
for(int i:a)
{
s.add(i);
}
System.out.println(s);
}
}
