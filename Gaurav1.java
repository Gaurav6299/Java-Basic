class Vikash
{
void eat()
{
System.out.println("I am eating something");
}

void dance()
{
System.out.println("I am doing dance");
}
}

class Gaurav1 extends Vikash
{
void eat()
{
System.out.println("I am not eating anything");
}

void sleep()
{
System.out.println("I gonna sleep");
}
public static void main(String args[])
{
Vikash v=new Gaurav1();
v.eat();

Gaurav1 g1=new Gaurav1();
g1.sleep();
}
}