import java.util.*;
class merge
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int b[]={5,10,23,45};
ArrayList<Integer> l=new ArrayList<>();
for(int i:a)
{
l.add(i);
}
for(int j:b)
{
l.add(j);
}
System.out.println(l);
}
}