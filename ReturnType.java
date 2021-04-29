class A{}
class B extends A{}

class Gaurav
{
A eat()
{
System.out.println("Hello how are you");
return new A();
}
}


class Sujit extends Gaurav
{
B eat()
{
System.out.println("hello Child how are you");
return new B();
}
}

class ReturnType
{
public static void main(String args[])
{
Gaurav g=new Sujit();
g.eat();
Gaurav g1=new Gaurav();
g1.eat();
}
}