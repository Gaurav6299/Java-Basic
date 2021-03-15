class Gaurav
{
void eat()
{
System.out.println("I am not eating");
}

void driving()
{
System.out.println("I am driving a car");
}

void read()
{

System.out.println("I am reading something");
}

}

class vikash extends Gaurav
{
void run()
{
System.out.println("I gonna run");
}

void sleep()
{
System.out.println("Hello can i sleep with you");
}
}

class kumar1 extends vikash
{
void run()
{
System.out.println("kumar is running");
}
public static void main(String args[])
{
kumar1 k=new kumar1();
k.run();
k.sleep();
k.driving();

vikash v=new vikash();
v.eat();
v.driving();
v.read();
}
}