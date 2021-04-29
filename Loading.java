class Collage
{
int sum()
{
return 8+9;
}

int sum(int x,int y)
{
return x+y;
}

double sum(int x,double y)
{
return x+y;
}
}

class Loading
{
public static void main(String args[])
{
Collage c=new Collage();
System.out.println(c.sum());
System.out.println(c.sum(2,3.4));
}
}