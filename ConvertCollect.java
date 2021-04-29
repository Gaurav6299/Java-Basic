import java.util.*;
class ConvertCollect
{
public static <T> Collection<T> convert(Iterable<T> i)
{
Collection<T> c=new ArrayList<T>();
i.forEach(c::add);
return c;
}
public static void main(String args[])
{
Iterable<Integer> i=Arrays.asList(1,2,3,4,5);
System.out.println(i);
Collection<Integer> c=convert(i);
System.out.println(c);
}
}
