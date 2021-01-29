import java.util.*;
class immuta
{
public static void main(String args[])
{
Map<Integer,Integer> map=Map.ofEntries(Map.entry(1,20),Map.entry(2,30),
                            Map.entry(3,40),Map.entry(4,50));

//map.put(5,30);
System.out.println("Immutable map is:"+map);
}
}
      