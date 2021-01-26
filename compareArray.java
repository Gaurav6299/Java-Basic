import java.util.*;
class compareArray
{
public static void main(String args[])
{
int a[]={12,1,2,3,4};
System.out.println("Original Array is:"+Arrays.toString(a));

int b[]=Arrays.copyOf(a,10);
System.out.println("copy Array is:"+Arrays.toString(b));
}
}