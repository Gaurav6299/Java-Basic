import java.util.*;
class Student
{
int roll;
String name;
Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public String toString()
{
return("Roll="+this.roll+" Name=" +this.name);
}
}

class sortByRoll implements Comparator<Student>
{
public int compare(Student a,Student b)
{
return a.roll-b.roll;
}
}
class biodata
{
public static void main(String args[])
{
Student a[]={new Student(2,"gaurav"),new Student(1,"Ankit"),
              new Student(3,"kushal")};

for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}

System.out.println("Sorted by Roll-------------");
Arrays.sort(a,new sortByRoll());
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}