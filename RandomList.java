import java.util.*;
class RandomList
{
static int randomElement(List<Integer> l)
{
Random r=new Random();
return l.get(r.nextInt(l.size()));
}
public static void main(String args[])
{
List<Integer> l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
System.out.println(l);
System.out.println(randomElement(l));
}
}