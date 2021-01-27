import java.util.*;
class weak
{
public static void main(String args[])
{
Map<Integer,String> weak=new WeakHashMap<>();
weak.put(1,"kushal");
weak.put(3,"kumar");
weak.put(5,"aman");
weak.put(2,"sujit");
weak.put(6,"Ankit");
System.out.println("Map is"+weak);

if(weak.containsValue("kumar"))
{
System.out.println("Yes! it is present");
}
if(weak.containsKey(4))
{
System.out.println("Yes it is exist");
}

System.out.println(weak.isEmpty());

weak.clear();
System.out.println("Map is:"+weak);
System.out.println("Is it empty:"+weak.isEmpty());
}
}