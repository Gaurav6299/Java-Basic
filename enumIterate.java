import java.util.*;
class enumIterate
{
public static void main(String args[])
{
Vector v=new Vector();
v.add("sujit");
v.add("kushal");
v.add("kumar");
v.add("vikash");
System.out.println(v);

v.forEach(e->System.out.println(e));

ArrayList<Integer> l=new ArrayList<>();
l.add(90);
l.add(10);
l.add(20);
l.add(30);
System.out.println(l);

l.forEach(e->System.out.println(e));
}
}