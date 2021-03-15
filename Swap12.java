class Car
{
int no;
Car(int no)
{
this.no=no;
}
}

class Swap12
{
static void swap(Car c1,Car c2)
{
int temp=c1.no;
c1.no=c2.no;
c2.no=temp;
} 

public static void main(String args[])
{
Car c1=new Car(2);
Car c2=new Car(4);
swap(c1,c2);
System.out.println("First Car is:"+c1.no);
System.out.println("Second car is:"+c2.no); 
}

}