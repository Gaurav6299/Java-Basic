import java.util.*;
class SetOfArray
{
public static void main(String args[])
{
HashSet<Integer> set=new HashSet<>();
set.add(1);
set.add(3);
set.add(4);
set.add(5);
System.out.println("HashSet is:"+set);

HashMap<String,String> hs=new HashMap<>();
hs.put(null,null);
hs.put("1","gaurav");
hs.put("2","ankit");
hs.put("3","sujit");
System.out.println("Map is:"+hs);
}
}