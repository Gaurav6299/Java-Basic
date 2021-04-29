import java.util.*;
class Permutation1
{
static void permutation(String s,int l,int h)
{
Set<String> set=new HashSet<>();
if(l==h)
{
if(set.contains(s))
return;

set.add(s);
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

static String swap(String s,int l,int h)
{
char c[]=s.toCharArray();
char temp=c[l];
c[l]=c[h];
c[h]=temp;
return String.valueOf(c);
}
public static void main(String args[])
{
String s="abc";
permutation(s,0,s.length()-1);
}
}