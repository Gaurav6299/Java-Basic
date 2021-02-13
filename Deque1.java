import java.util.*;
class Deque1
{
public static void main(String args[])
{
Deque<Integer> s=new ArrayDeque<>();
s.add(10);
s.add(20);
s.add(30);
s.add(40);
System.out.println(s);
Iterator i=s.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}

}
}