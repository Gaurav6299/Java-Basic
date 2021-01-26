class Student
{
int roll;
String name;
Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}
}

class Array
{
public static void main(String args[])
{
Student a[]=new Student[3];
a[0]=new Student(1,"gaurav");
a[1]=new Student(2,"sujit");
a[2]=new Student(3,"kumar");

for(int i=0;i<a.length;i++)
{
System.out.println(a[i].roll+ " : "+a[i].name); 
}

}
}