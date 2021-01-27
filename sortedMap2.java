import java.util.*;
class sortedMap2
{
public static void main(String args[])
{
System.out.println("Initialize a sorted map using generics");
SortedMap<String,String> map=new TreeMap<>();
map.put("gaurav","CSE");
map.put("kumar","mech");
map.put("kushal","Das");
map.put("vikash","cse");
System.out.println(map);

System.out.println("Default initialization:-");
SortedMap sm=new TreeMap();

sm.put(3,"kumar");
sm.put(1,"NIT");
sm.put(2,"GIT");
System.out.println("SortedMap is:"+sm);

System.out.println("Another map");
SortedMap map1=new TreeMap();
map1.put("cse",10);
map1.put("mech",5);
map1.put("ece",4);
System.out.println(map1);
}
}