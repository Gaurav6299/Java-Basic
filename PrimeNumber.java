class PrimeNumber
{
public static void main(String args[])
{
int n=4;
boolean isPrime=true;
for(int i=2;i<n;i++)
{
if(n%2==0)
{
isPrime=false;
break;
}
}
if(n<2) isPrime=false;
System.out.println("IsPrime="+isPrime);
}
}
