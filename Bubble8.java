import java.util.*;
class Bubble8
{
public static void main(String args[])
{
int a[]={12,1,4,3,2,5,6};
int n=a.length;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}

System.out.println(Arrays.toString(a));
} 
}