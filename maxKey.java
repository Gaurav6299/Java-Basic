import java.util.*;
class maxKey
{
public static void main(String args[])
{
Map<Integer,Integer> map=new HashMap<>();
map.put(2,10);
map.put('
5,20);
map.put(4,30);
System.out.println("Map is:"+map);

Map.Entry<Integer,Integer> entryMax=null;
for(Map.Entry<Integer,Integer> m:map.entrySet())
{
if(entryMax==null|| m.getKey().compareTo(entryMax.getKey())>0)
{
entryMax=m;
}
}
System.out.println("Highest Entry is:"+entryMax);

}
}
