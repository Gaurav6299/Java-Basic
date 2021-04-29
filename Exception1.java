class  Parent
{
void eat() throws RuntimeException
{
System.out.println("I am doing the same things");
}
}

class child1 extends Parent
{
void eat() throws ArithmeticException
{
System.out.println("It will throws an child class Exception");
}
}

class Exception1
{
public static void main(String args[])
{
child1 c=new child1();
c.eat();
}
}