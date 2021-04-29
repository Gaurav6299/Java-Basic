class Teacher
{
String name;
String collage;
Teacher()
{
this("gaurav","NIT");
System.out.println("Another constructor will called");
}

Teacher(String name,String collage)
{
this.name=name;
this.collage=collage;
}
}

class kumarKo
{
public static void main(String args[])
{
Teacher t=new Teacher();
System.out.println("Name="+t.name+" and collage="+t.collage);
}
}