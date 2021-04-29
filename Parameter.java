class teacher
{
String name;
int a;
teacher(String name,int a)
{
this.name=name;
this.a=a;
}

void get()
{
print(this);
}

void print(teacher ob)
{
System.out.println("Name="+ob.name+" and a="+ob.a);
}
}

class Parameter
{
public static void main(String args[])
{
teacher t=new teacher("gaurav",153);
t.get();
}
}