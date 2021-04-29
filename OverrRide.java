class Student
{
void eat()
{
System.out.println(" i am eating in parent");
}

void happy()
{
System.out.println("Hello how are you");
}
}

class teacher extends Student
{
void eat()
{
System.out.println("Hello child");
}

void happy()
{
System.out.println("Hello i am happy");
}
}

class OverrRide
{
public static void main(String args[])
{
teacher t=new teacher();
t.eat();

Student s=new Student();
s.happy();
s.eat();
}
}