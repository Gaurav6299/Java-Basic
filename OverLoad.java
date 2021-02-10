class OverLoad
{
int a;
int b;
int c;
void eat(int a)
{
this.a=a;
System.out.println("the value of a="+a);
}

void eat(int a,int b)
{
this.b=b;
System.out.println("the value a=" +a+ " and b="+b);
}

int eat(int a,int b,int c)
{
this.c=c;
return (a+b+c);
}

void eat(String s,int a)
{
System.out.println(s+" "+a);
}
public static void main(String args[])
{
OverLoad o=new OverLoad();
o.eat(10);
o.eat(20,30);
System.out.println(o.eat(12,22,34));
o.eat("gaurav",10);
}  
}