import java.util.*;
class BinarySearch2
{
static int binarySearch(int a[],int low,int search,int high)
{
int mid=low+(high-low)/2;

while(low<=high)
{
if(a[mid]==search)
{
return mid;
}

else if(a[mid]<search)
low=mid+1;

else if(a[mid]>search)
high=mid-1;
}
return -1;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the number");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int k=binarySearch(a,0,30,n-1);
System.out.println("The searching element is:"+k);
}
}
