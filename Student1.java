class Student1
{
int age;
String name;
Student1(int age,String name)
{
this.name=name;
this.age=age;
}

public String toString()
{
return("Name="+this.name+" Age="+this.age);
}

public static void main(String args[])
{
Student1 s=new Student1(12,"Gaurav");
System.out.println(s.toString());
}
}