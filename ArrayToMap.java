import java.util.*;
class Student
{
private int id;
private String name;
Student(int id,String name)
{
this.id=id;
this.name=name;
}

int getId()
{
return id;
}

String getName()
{
return name;
}
}

class ArrayToMap
{
public static void main(String args[])
{
ArrayList<Student> l=new ArrayList<>();

l.add(new Student(1,"gaurav"));
l.add(new Student(2,"sujit"));
l.add(new Student(3,"ankit"));

HashMap<Integer,String> map=new HashMap<>();
for(Student s:l)
{
map.put(s.getId(),s.getName());
}

System.out.println("Map is:"+map);
}
}