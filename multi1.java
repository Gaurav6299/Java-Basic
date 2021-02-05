class sujit
{
void eat()
{
System.out.println("He is eating now");
}
void read()
{
System.out.println("He is very Brillient");
}
}

class gaurav extends sujit
{
void eat()
{
System.out.println("He is also eating everyThing");
}

void dance()
{
System.out.println("I am doing dance");
}
}

class kumar extends gaurav
{
void coder()
{
System.out.println("I am doing code");
}
void sleep()
{
System.out.println("I gonna sleep");
}
}

class multi1
{
public static void main(String args[])
{
kumar k=new kumar();
k.coder();
k.eat();
}
}