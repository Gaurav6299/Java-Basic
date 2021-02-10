class sujit
{
void eat()
{
System.out.println("Hello I am sorry");
}
void play()
{
System.out.println("Hello i am playing");
}
}

class gaurav extends sujit
{
void eat()
{
System.out.println("Helllo i am subclass");
}

void play()
{
System.out.println("I am call to everything");
}
}

class Override
{
public static void main(String args[])
{
gaurav g=new gaurav();
g.eat();

sujit s=new sujit();
s.play();
}
}