class Student2
{
String name;
Student2(String name)
{
this.name=name;
}

static void swap(Student2 s1,Student2 s2)
{
String temp=s1.name;
s1.name=s2.name;
s2.name=temp;
}

public static void main(String args[])
{
Student2 s1=new Student2("gaurav");
Student2 s2=new Student2("sujit");
swap(s1,s2);
System.out.println("S1.name="+s1.name+" S2.name="+s2.name);
}
}
