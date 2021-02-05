class Dog
{
void bark()
{
System.out.println("It is barking");
}

void eat()
{
System.out.println("I am eating");
}
}

class baby extends Dog
{
void bark()
{
System.out.println("It is not barking");
}

void sleep()
{
System.out.println("He is very boring");
}
}

class single
{
public static void main(String args[])
{
baby b=new baby();
b.bark();
b.eat();
}
}
