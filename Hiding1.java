class Student 
{
static void run()
{
System.out.println("This is method hiding");
}

void eat()
{
System.out.println("Hello method overriding");
}

void play()
{
System.out.println("hello i am doing");
}
}

class Collage extends Student
{
static void run()
{
System.out.println("Hello child hiding");
}

void eat()
{
System.out.println("Hello method riding");
}

void play()
{
System.out.println("Hello, I am playing in collage");
}
}

class Hiding1
{
public static void main(String args[])
{
Student c=new Collage();
c.eat();
c.run();
c.play();
}
}