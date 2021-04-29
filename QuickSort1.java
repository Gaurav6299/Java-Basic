import java.util.*;
class QuickSort1
{
static void quickSort(int a[],int l,int h)
{
if(l<h)
{
int pivot=partition(a,l,h);
quickSort(a,l,pivot-1);
quickSort(a,pivot+1,h);
}
}

static int partition(int a[],int l,int h)
{
int pivot=a[l];
int i=l;
int j=h;
while(i<j)
{
while(a[i]<=pivot)
{
i++;
}

while(a[j]>pivot)
{
j--;
}

if(i<j)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}

}

int k=a[l];
a[l]=a[j];
a[j]=k;
return j;
}
public static void main(String args[])
{
int a[]={2,1,4,5,7,6,9,8};
int n=a.length;
quickSort(a,0,n-1);
System.out.println(Arrays.toString(a));
}
}