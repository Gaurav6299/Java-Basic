class hello
{
int age;
String name;
void run()
{
age=10;
System.out.println("hello i am gaurav and age is:"+age);
}

void play()
{
name="sujit";
System.out.println("Can you tell me your name:"+name);
}
}

class Dogi
{
public static void main(String args[])
{
hello h=new hello();
h.run();
h.play();
}
}