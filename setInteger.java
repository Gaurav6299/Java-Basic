//convert set of String to set of Integer
import java.util.*;
import java.util.stream.*;
class setInteger
{
static void convertSetToInteger(Set<String> set)
{
Set<Integer> setofint=set.stream().map(k->Integer.parseInt(k)).
                       collect(Collectors.toSet());

System.out.println(setofint);
}
public static void main(String args[])
{
Set<String> set=new HashSet<>(Arrays.asList("1","2","3","4","5"));
convertSetToInteger(set);
}
}