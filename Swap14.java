class Car
{
int no;
String name;
Car(int no,String name)
{
this.no=no;
this.name=name;
}

void print()
{
System.out.println("No="+no+" Name "+name);
}
}

class Wrapper
{
Car c;
Wrapper(Car c)
{
this.c=c;
}

}

class Swap14
{
static void swap(Wrapper w1,Wrapper w2)
{
Car temp=w1.c;
w1.c=w2.c;
w2.c=temp;
}
public static void main(String args[])
{
Car c1=new Car(10,"BMW");
Car c2=new Car(20,"Swift");

Wrapper w1=new Wrapper(c1);
Wrapper w2=new Wrapper(c2);
swap(w1,w2);
w1.c.print();
w2.c.print();
}