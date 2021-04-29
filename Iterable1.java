import java.util.*;
class Iterable1
{
public static void main(String args[])
{
Iterable<Integer> i=Arrays.asList(1,2,3,4);
System.out.println(i);

Collection<Integer>  c=new ArrayList<>();
for(Integer x:i)
{
c.add(x);
}

System.out.println(c);
}
}