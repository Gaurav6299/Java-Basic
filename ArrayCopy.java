import java.util.*;
class ArrayCopy
{
public static void main(String args[])
{
int a[]={11,2,4,4,12,10,8,7};
int b[]={1,2,4,5};
System.out.println(Arrays.mismatch(a,b));
Arrays.sort(a,3,8);
System.out.println(Arrays.toString(a));
}
}