class Encapsulate
{
private String collage;
private int roll;

public void setCollage(String collage)
{
this.collage=collage;
}

public void setRoll(int roll)
{
this.roll=roll;
}

public String getCollage()
{
return collage;
}

public int getRoll()
{
return roll;
}

}

class Encapsu2
{
public static void main(String args[])
{
Encapsulate e=new Encapsulate();
e.setCollage("NIT");
e.setRoll(153);

System.out.println("Collage="+e.getCollage());
System.out.println("Roll="+e.getRoll());
}
}