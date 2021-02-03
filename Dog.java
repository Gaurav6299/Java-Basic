class Dog
{
int age;
String name;
Dog(int age,String name)
{
this.age=age;
this.name=name;
}
public static void main(String args[])
{
Dog d=new Dog(2,"Seru");
Dog d1=new Dog(3,"Rocky");
System.out.println("Age of Dog1="+d.age+ " Name of Dog="+d.name);
System.out.println("Age of Dog2="+d1.age+" Name of Dog2="+d1.name);
}
} 
