//print the whole permutation of the given string
class permu1
{
static void permutation(String s,int l,int h)
{
if(l==h)
{
System.out.println(s);
return;
}


for(int i=l;i<=h;i++)
{
s=swap(s,l,i);
permutation(s,l+1,h);
s=swap(s,l,i);
}
}


static String swap(String s,int l,int i)
{
char c[]=s.toCharArray();
char temp=c[l];
c[l]=c[i];
c[i]=temp;
return String.valueOf(c);
}

public static void main(String args[])
{
String s="abc";
permutation(s,0,s.length()-1);

}
}