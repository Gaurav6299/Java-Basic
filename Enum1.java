import java.util.*;
class Enum1
{
enum student
{
CODE,CONTRIBUTING,JAVA,PYTHON;
}

public static void main(String args[])
{
EnumMap<student,String> map=new EnumMap<>(student.class);
map.put(student.CODE,"Hello");
map.put(student.CONTRIBUTING,"We are contributing something");
map.put(student.JAVA,"I am learning java");
map.put(student.PYTHON,"I am also learning java");
System.out.println("the map is:"+map);
System.out.println("\nSize of Enum map is:"+map.size());
System.out.println("\nThe Retrieving data:"+map.get(student.JAVA));
System.out.println("\nAnother data is:"+map.get(student.CONTRIBUTING));
System.out.println("Is it present:"+map.containsKey(student.CODE));
}
}