class Car
{
int no;
int brake;
Car(int no,int brake)
{
this.no=no;
this.brake=brake;
}
void print()
{
System.out.println("No="+no+" Brake="+brake);
}
}

class SwapCar
{
Car c1;
SwapCar(Car c1)
{
this.c1=c1;
}

}
class Swap13
{
static void swap(SwapCar c3,SwapCar c4)
{
Car temp=c3.c1;
c3.c1=c4.c1;
c4.c1=temp;
}
public static void main(String args[])
{
Car c1=new Car(2,10);
Car c2=new Car(10,20);
SwapCar c3=new SwapCar(c1);
SwapCar c4=new SwapCar(c2);
swap(c3,c4);
c3.c1.print();
c4.c1.print();
}
}