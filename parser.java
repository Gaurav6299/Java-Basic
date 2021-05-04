import java.util.*;
class parser
{
static String remove(String s,int k)
{
if(s.length()<=k)return "0";
char c[]=s.toCharArray();
int top=-1;
for(int i=0;i<c.length;i++)
{
while(top>=0 && c[top]>c[i] && k>0)
{
top--;
k--;
}
top++;
c[top]=c[i];
}

int i=0;
while(i<=top && c[i]=='0')i++;

String str="";
for(int j=i;j<digit;j++)
{
str+=c[j];
} 

if(str.equals(""))return "0";
return str;
}
public static void main(String args[])
{
String s="1432219";
int k=3;
System.out.println(remove(s,k));
}
}
