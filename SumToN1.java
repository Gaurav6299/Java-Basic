class SumToN1
{
public static void main(String args[])
{
int n=6;
float res=0;
for(float i=1;i<=n;i++)
{
if(i%2==0)
{
res-=1/i;
}
else
{
res+=1/i;
}
}
System.out.println("The sum number is:"+res);
}
}