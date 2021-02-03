import java.util.concurrent.*;
import java.util.*;
class ArrayBlock
{
public static void main(String args[])
{
ArrayBlockingQueue<Integer> ab=new ArrayBlockingQueue<>(4);
ab.add(10);
ab.add(20);
ab.add(30);
ab.add(40);
System.out.println("ArrayBlocking is:"+ab);
int data=ab.peek();
System.out.println("Head element is:"+data);
ab.remove(30);
System.out.println(ab);
//System.out.println(ab.poll());

Iterator i=ab.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}