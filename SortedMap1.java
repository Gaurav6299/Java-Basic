import java.util.*;
class SortedMap1
{
public static void main(String args[])
{
SortedMap<Integer,String> sm=new TreeMap<>();
sm.put(3,"Gaurav");
sm.put(4,"Ankit");
sm.put(1,"vikash");
sm.put(2,"kushal");
System.out.println("SortedMap is:"+sm);
for(Map.Entry<Integer,String> map:sm.entrySet())
{
System.out.print(map.getKey()+":");
System.out.println(map.getValue());
}
}
}