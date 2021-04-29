import java.util.*;
class Adjacent
{
static List<String> l=new ArrayList<>();
static void push(String k)
{
int i=0;
if(l.isEmpty())
{
l.add(i,k);
i++;
}
else
{
if(l.get(i).equals(l.get(i-1)))
{
l.remove(l.size()-1);
i++;
}
}
}

static void print()
{
System.out.println(l);
}
public static void main(String args[])
{
String s="abbaca";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
push(Character.toString(c[i]));
}

print();
}
}