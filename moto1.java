class Bicycle
{
int gear;
int speed;
Bicycle(int gear,int speed)
{
this.gear=gear;
this.speed=speed;
}

public String toString()
{
return("Gear="+gear+" Speed="+speed);
}
}

class Bike extends Bicycle
{
int height;
Bike(int gear,int speed,int height)
{
super(gear,speed);
this.height=height;
}

public String toString()
{
return(super.toString()+" Height="+height);
}
}

class moto1
{
public static void main(String args[])
{
Bike b=new Bike(6,5,20);
Bike b1=new Bike(10,3,30);
System.out.println(b.toString());
System.out.println(b1.toString());
}
}