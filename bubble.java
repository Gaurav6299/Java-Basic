import java.util.*;
class bubble
{
public static void main(String args[])
{
int a[]={10,2,3,-1,4};
int n=a.length;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j+1]<a[j])
{
int temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}
System.out.println(Arrays.toString(a));
}
}