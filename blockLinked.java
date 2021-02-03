import java.util.concurrent.*;
import java.util.*;
class blockLinked
{
public static void main(String args[])
{
PriorityBlockingQueue<Integer> l=new PriorityBlockingQueue<>(3,Comparator.reverseOrder());
l.add(12);
l.add(30);
l.add(9);
System.out.println("Linked Queue is:"+l);
}
}
