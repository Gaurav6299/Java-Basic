//-----------------Sum of Arrays Values------------------
class multi
{
static int sumArray(int a[])
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
return sum;
}
public static void main(String args[])
{
int a[]={12,2,3,4,5};
System.out.println(sumArray(a));
}
}