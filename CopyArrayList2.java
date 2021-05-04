import java.util.*;
class CopyArrayList2
{
int n=3;
class Data
{
int roll;
String name;
int marks;
Data(int roll,String name,int marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;
}

public String toString()
{
return ("Roll="+this.roll+ " Name="+this.name+" marks="+this.marks);
}
}
public static void main(String args[])
{
int roll[]={1,2,3};
String name[]={"sujit","gaurav","kushal"};
int marks[]={100,200,300};

CopyArrayList2 l=new CopyArrayList2();
l.addValues(roll,name,marks);
}

void addValues(int roll[],String name[],int marks[])
{
for(int i=0;i<n;i++)
{
Data d=new Data(roll[i],name[i],marks[i]);
System.out.println(d);
}
}
}