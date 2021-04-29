import java.util.stream.*;
import java.util.*;
class StreamArray
{
static Set<Integer> findDuplicate(Stream<Integer> s)
{
Set<Integer> set=new HashSet<>();

return s.filter(n->!set.add(n)).collect(Collectors.toSet());
}
public static void main(String args[])
{
Stream<Integer> s=Stream.of(12,1,2,12,10,10);
System.out.println(findDuplicate(s));
}
}