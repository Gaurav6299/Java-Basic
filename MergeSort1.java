import java.util.*;
class MergeSort1
{
static void merge(int a[],int b[])
{
int c[]=new int[a.length+b.length];
int i=0;
int j=0;
int k=0;
while(i<a.length && j<b.length)
{
if(a[i]<b[j])
{
c[k]=a[i];
k++;
i++;
}
else
{
c[k]=b[j];
k++;
j++;
}
}
while(i<a.length)
{
c[k]=a[i];
i++;
k++;
}

while(j<b.length)
{
c[k]=b[j];
k++;
j++;
}

System.out.println(Arrays.toString(c));
}
public static void main(String args[])
{
int a[]={2,4,5,6,7};
int b[]={1,3,8,9};
merge(a,b);
}
}