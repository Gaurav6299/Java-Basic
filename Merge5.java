class Merge5
{
int array[];
int length;
int temp[];
public static void main(String args[])
{
int a[]={4,5,2,1,9};
Merge5 m=new Merge5();
m.ArraySort(a);

for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}

void ArraySort(int a[])
{
this.array=a;	
this.length=a.length;
this.temp=new int[length];
divide(0,length-1);
}

void divide(int lower,int higher)
{
if(lower<higher)
{
int middle=lower+(higher-lower)/2;
divide(lower,middle);
divide(middle+1,higher);
merge(lower,middle,higher);
}
}

void merge(int lower,int middle,int higher)
{
for(int i=lower;i<=higher;i++)
{
temp[i]=array[i];
}
int i=lower;
int j=middle+1;
int k=lower;
while(i<=middle && j<=higher)
{
if(temp[i]<=temp[j])
{
array[k]=temp[i];
i++;
}
else
{
array[k]=temp[j];
j++;
}
k++;
}
while(i<=middle)
{
array[k]=temp[i];
i++;
k++;
}
}
}
