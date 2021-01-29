import java.lang.reflect.Array;
import java.util.*;
class javaReflect
{
public static void main(String args[])
{
int size=5;
int a[]=(int[])Array.newInstance(int.class,size);
System.out.println(Arrays.toString(a));
Array.setInt(a,0,10);
Array.setInt(a,1,20);
Array.setInt(a,2,30);
Array.setInt(a,3,50);
Array.setInt(a,4,90);
System.out.println(Arrays.toString(a));
System.out.println("At position at index 0:"+Array.getInt(a,0));
System.out.println("At position at index 1:"+Array.getInt(a,1));
System.out.println("At position at index 2:"+Array.getInt(a,2));
System.out.println("At position at index 3:"+Array.getInt(a,3));
}
}