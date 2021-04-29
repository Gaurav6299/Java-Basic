import java.util.*;
class Student
{
String name;
int roll;
Student(String name,int roll)
{
this.name=name;
this.roll=roll;
}

public String toString()
{
return ("name="+this.name+ " and roll="+this.roll);
}
}


class SortByRoll implements Comparator<Student>
{
public int compare(Student a,Student b)
{
return a.roll-b.roll;
}
}
class StudentSort
{
public static void main(String args[])
{
ArrayList<Student> l=new ArrayList<>();
l.add(new Student("gaurav",153));
l.add(new Student("aman",121));
l.add(new Student("kushal",120));

System.out.println(l);
System.out.println("Unsorted data===============");
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i));
}

Comparator c=Collections.reverseOrder(new SortByRoll());
Collections.sort(l,c);
System.out.println("Sorted order========");
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i));
}
}
}