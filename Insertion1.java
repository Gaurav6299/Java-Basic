import java.util.*;
class Insertion1
{
public static void main(String args[])
{
int a[]={6,5,4,3,2,1};
int n=a.length;
for(int i=1;i<n;i++)
{
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp)
{
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}

System.out.println(Arrays.toString(a));
}
}