import java.lang.reflect.Array;
import java.util.*;
class reflect
{
public static void main(String args[])
{
double x[]=(double[])Array.newInstance(double.class,5);
Array.setDouble(x,0,10);
Array.setDouble(x,1,20);
Array.setDouble(x,2,30);
Array.setDouble(x,3,40);
System.out.println(Arrays.toString(x));
System.out.println("At index 0:"+Array.getDouble(x,0));
System.out.println("At index 1:"+Array.getDouble(x,1));
System.out.println("At index 2:"+Array.getDouble(x,2));
System.out.println("At index 3:"+Array.getDouble(x,3));
}
}