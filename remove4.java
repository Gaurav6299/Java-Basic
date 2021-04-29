class remove4
{
static int remove(int a[],int val)
{
int i=0;
int j=1;
while(i<a.length && j<a.length)
{
if(a[j]==val)
j++;
else
{
i++;
a[i]=a[j];
j++;
}
}
return i+1;
}
public static void main(String args[])
{
int a[]={1,2,2,3,3,3,4,3};
int val=3;
System.out.println(remove(a,val));
}
}