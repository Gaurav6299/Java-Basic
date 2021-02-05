class collage
{
String name;
int roll;
int age;
collage(String name,int roll,int age)
{
this.name=name;
this.roll=roll;
this.age=age;
}
void print()
{
System.out.println("Name="+name+" Roll="+roll+" Age="+age);
}
}

class wrapper
{
collage c;
wrapper(collage c)
{
this.c=c;
}
}

class collage3
{
static void swap(wrapper w1,wrapper w2)
{
collage temp=w1.c;
w1.c=w2.c;
w2.c=temp;
}
public static void main(String args[])
{
collage c1=new collage("gaurav",153,23);
collage c2=new collage("kushal",156,20);
wrapper w1=new wrapper(c1);
wrapper w2=new wrapper(c2);
swap(w1,w2);
w1.c.print();
w2.c.print();
}
}