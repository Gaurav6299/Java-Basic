class remove2
{
static int remove(int a[])
{
int i=0;
int j=1;
if(a.length==0)
return 0;

while(i<a.length && j<a.length)
{
if(a[i]==a[j])
{
j++;
}
else
{
i++;
a[i]=a[j];
}
}
return i+1;
}
public static void main(String args[])
{
int a[]={1,2,2,3,4};
System.out.println(remove(a));
}
}