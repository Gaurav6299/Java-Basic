class palin13
{
public static void main(String args[])
{
int n=121;
int rem=0;
int rev=0;
int temp=n;
while(temp>0)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(n==rev)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not palindrom");
}
}
}