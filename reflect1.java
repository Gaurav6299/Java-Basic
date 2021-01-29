import java.lang.reflect.Array;
import java.util.*;
class reflect1
{
public static void main(String args[])
{
int a[]=new int[3];
Array.setInt(a,0,10);
Array.setInt(a,1,20);
System.out.println(Arrays.toString(a));
System.out.println("At index:"+Array.getInt(a,0));
}
}