import java.util.*;
class CopyArrayList1
{
int n=4;
class Data
{
int roll;
String name;
int marks;
long phone;
Data(int roll,String name,int marks,long phone)
{
this.roll=roll;
this.name=name;
this.marks=marks;
this.phone=phone;
}
}

public static void main(String args[])
{
int roll[]={1,2,3,4};
String name[]={"gaurav","sujit","kushal","kumar"};
int marks[]={100,200,300,400};
long phone[]={123445,78797,6299164,78704971};

CopyArrayList1 l=new CopyArrayList1();
l.addValues(roll,name,marks,phone);
}

void addValues(int roll[],String name[],int marks[],long phone[])
{
ArrayList<Data> l=new ArrayList<>();
for(int i=0;i<n;i++)
{
l.add(new Data(roll[i],name[i],marks[i],phone[i]));
}
print(l);
}

void print(ArrayList<Data> l)
{
for(int i=0;i<n;i++)
{
Data d=l.get(i);
System.out.println(d.roll+" "+d.name+" "+d.marks+" "+d.phone);
}
}
}