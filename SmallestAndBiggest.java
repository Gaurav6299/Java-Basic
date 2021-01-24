class SmallestAndBiggest
{
static void palindrome(String word[])
{
int n=word.length;
int count=0;
String small="",biggest="";

for(int i=0;i<n;i++)
{
if(checkPalin(word[i]))
{
count++;
if(count==1)
{
small=biggest=word[i];
}
else
{
if(word[i].length()<small.length())
{
small=word[i];
}

if(word[i].length()>biggest.length())
{
biggest=word[i];
}
}
}
}
if(count==0)
{
System.out.println("Not palindrome");
}
else
{
System.out.println("Smallest="+small);
System.out.println("Biggest="+biggest);
}
}

static boolean checkPalin(String s)
{
int n=s.length();
s=s.toLowerCase();
for(int i=0;i<n;i++,n--)
{
if(s.charAt(i)!=s.charAt(n-1))
{
return false;
}
}
return true;
}
public static void main(String args[])
{
String s="hello wow what i ahve to do madam";
String word[]=s.split(" ");
System.out.println("Inputed String is:"+s);
palindrome(word);
}
}