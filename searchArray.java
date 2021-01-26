import java.util.*;
class searchArray
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int key=6;
int index=Arrays.binarySearch(a,key);
if(index>0)
{
System.out.println("Element found at index:"+index);
}
else
{
System.out.println("Element not found:"+index);
}

}
}