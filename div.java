class div
{
public static void main(String args[])
{
int a=1;
int b=2;
if(a<b)
{
double x=Double.valueOf(a)/Double.valueOf(b);
System.out.println(Double.toString(x));
}
else
{
int x=a/b;
System.out.println(Integer.toString(x));
}

}
}