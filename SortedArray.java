import java.util.*;
class SortedArray
{
static void merge(int a[],int b[])
{
int j=0;
int i=0;
while(i<a.length)
{
Arrays.sort(b);
if(a[i]<b[j])
i++;

else
{
int temp=a[i];
a[i]=b[j];
b[j]=temp;
i++;
}
}

Arrays.sort(a);
for(int k=0;k<b.length;k++)
{
a[i]=b[k];
i++;
}
System.out.println(Arrays.toString(a));
}
public static void main(String args[])
{
int a[]={1,4,7,8,9};
int b[]={2,5,6,7};
merge(a,b);
}
}
