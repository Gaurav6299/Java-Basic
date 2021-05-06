import java.util.*;
class MergeSort2
{
static void mergeSort(int a[],int l,int h)
{
if(l<h)
{
int mid=(l+h)/2;
mergeSort(a,l,mid);
mergeSort(a,mid+1,h);
merge(a,l,mid,h);
}
}

static void merge(int a[],int l,int mid,int h)
{
int i=l;
int j=mid+1;
int k=l;
int b[]=new int[a.length];
while(i<=mid && j<=h)
{
if(a[j]<a[i])
{
b[k]=a[j];
j++;
}
else
{
b[k]=a[i];
i++;
}
k++;
}

if(i>mid)
{
while(j<=h)
{
b[k]=a[j];
k++;
j++;
}
}
else{
while(i<=mid)
{
b[k]=a[i];
k++;
i++;
}
}

for(int t=l;t<=h;t++)
{
a[t]=b[t];
}
}
public static void main(String args[])
{
int a[]={6,5,4,3,2,1};
int n=a.length;
mergeSort(a,0,n-1);
System.out.println(Arrays.toString(a));
}
}