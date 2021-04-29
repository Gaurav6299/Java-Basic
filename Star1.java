class Star1
{
public static void main(String args[])
{
int n=5;
int row=2*n-1;
for(int i=1;i<=row;i++)
{
if(i<=n)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
}
else
{
for(int k=1;k<=row-i+1;k++)
{
System.out.print("*");
}
}
System.out.println(" ");
System.out.println();
}
}
}