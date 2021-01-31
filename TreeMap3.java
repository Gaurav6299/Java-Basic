import java.util.*;
class TreeMap3
{
static ArrayList<Integer> l=new ArrayList<>();
static void flatten(List<Integer> list)
{
for(Integer i:list)
{
l.add(i);
}
}
public static void main(String args[])
{
Map<Integer,List<Integer>> map=new HashMap<>();
map.put(1,Arrays.asList(1,2));
map.put(2,Arrays.asList(3,4,5));
System.out.println(map);
for(Map.Entry<Integer,List<Integer>> m:map.entrySet())
{
List<Integer> k=m.getValue();
flatten(k);
}

System.out.println(l);
}
}