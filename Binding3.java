class Binding3
{
static class Parent
{
static void eat()
{
System.out.println("I am hungry now");
}
}

static class Child extends Parent
{
static void eat()
{
System.out.println("I am eating in child");
}
}

public static void main(String args[])
{
Parent p=new Parent();
p.eat();

Child c=new Child();
c.eat();
}
}