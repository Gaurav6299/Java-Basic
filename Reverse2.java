import java.util.*;
class Reverse2
{
public static void main(String args[])
{
Integer a[]={10,2,20,15,11,12};
Arrays.sort(a,Collections.reverseOrder());
System.out.println(Arrays.toString(a));
}
}