class Car
{
int model,no;
Car(int model,int no)
{
this.model=model;
this.no=no;
}
void print()
{
System.out.println("Models="+model+" No="+no);
}
}

class wrapper
{
Car c;
wrapper(Car c)
{
this.c=c;
}
}

class SwapObj
{
static void swap(wrapper w1,wrapper w2)
{
Car temp=w1.c;
w1.c=w2.c;
w2.c=temp;
}
public static void main(String args[])
{
Car c1=new Car(12,20);
Car c2=new Car(22,21);
wrapper w1=new wrapper(c1);
wrapper w2=new wrapper(c2);
swap(w1,w2);
w1.c.print();
w2.c.print();
}
}