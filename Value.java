import java.util.*;
class sujit
{
String name;
int count=0;
void getValue(String name,List<String> l)
{
synchronized(this)
{
this.name=name;
count++;
}
l.add(name);
System.out.println(count);
}
}

class Value
{
public static void main(String args[])
{
sujit s=new sujit();
List<String> l=new ArrayList<>();
s.getValue("gaurav",l);
System.out.println(s.name);
System.out.println(l);
}
}
