import java.util.*;
class customArray
{
int size=4;
class Data
{
int roll;
String name;
Data(int roll,String name)
{
this.roll=roll;
this.name=name;
}
}

void addValue(int roll[],String name[])
{
ArrayList<Data> l=new ArrayList<>();
for(int i=0;i<size;i++)
{
l.add(new Data(roll[i],name[i]));
}
printArray(l);
}

public void printArray(ArrayList<Data> l)
{
for(int i=0;i<size;i++)
{
System.out.println("Roll="+l.get(i).roll+" Name="+l.get(i).name);
}
}

public static void main(String args[])
{
int roll[]={1,2,3,4};
String name[]={"sujit","kushal","kumar","ankit"};
customArray c=new customArray();
c.addValue(roll,name);
}
}