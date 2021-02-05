class sujit
{
void run()
{
System.out.println("I am running very fast");
}

void sleep()
{
System.out.println("I am sleeping");
}
}

class gaurav extends sujit
{
void eat()
{
System.out.println("I am eating");
}

void read()
{
System.out.println("I am reading");
}
}

class kumar extends sujit
{
void run()
{
System.out.println("I am not running");
}

void write()
{
System.out.println("I am writing");
}
}

class multilevel
{
public static void main(String args[])
{
kumar k=new kumar();
k.run();
}
}