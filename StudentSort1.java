import java.util.*;
class Teacher
{
String name;
String branch;
Teacher(String name,String branch)
{
this.name=name;
this.branch=branch;
}

public String toString()
{
return ("name="+this.name+ " and branch="+this.branch);
}
}


class SortByBranch implements Comparator<Teacher>
{
public int compare(Teacher a,Teacher b)
{
return a.branch.compareTo(b.branch);
}
}

class StudentSort1
{
public static void main(String args[])
{
ArrayList<Teacher> l=new ArrayList<>();
l.add(new Teacher("gaurav","CSE"));
l.add(new Teacher("sujit","MECH"));
l.add(new Teacher("kushal","ECE"));

System.out.println("Before Sorted");
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i));
}

Collections.sort(l,new SortByBranch());
System.out.println("Sort By Branch");
for(int i=0;i<l.size();i++)
{
System.out.println(l.get(i));
}
}
}