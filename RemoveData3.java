import java.util.*;
class RemoveData3 extends ArrayList<Integer>
{
public static void main(String args[])
{
RemoveData3 l=new RemoveData3();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
System.out.println(l);
l.removeRange(2,4);
System.out.println(l);

}
}