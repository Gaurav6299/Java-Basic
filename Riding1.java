class Student
{
void eat()
{
System.out.println("I am eating now");
}

}

class teacher extends Student
{
void eat()
{
super.eat();
System.out.println("Hello child");
}
}

class Riding1
{
public static void main(String args[])
{
teacher t=new teacher();
t.eat();
}
}

