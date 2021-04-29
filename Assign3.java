class A{}
class B extends A{}

class Base
{
A run()
{
System.out.println("Hello how are you...");
return new A();
}
}


class Child extends Base
{
B run()
{
System.out.println("This is my child class");
return new B();
}
}

class Assign3
{
public static void main(String args[])
{
Child c=new Child();
c.run();

Base b=new Base();
b.run();
}
}
