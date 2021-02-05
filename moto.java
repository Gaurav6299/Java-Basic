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

class motor extends Bicycle
{
int height;
motor(int gear,int speed,int height)
{
super(gear,speed);
this.height=height;
}

public String toString()
{
return(super.toString()+" Height="+height);
}
}

class moto
{
public static void main(String args[])
{
motor m=new motor(2,4,30);
System.out.println(m.toString());
}
}