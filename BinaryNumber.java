class BinaryNumber
{
Node head;
class Node
{
int data;
Node next;
Node(int d)
{
data=d;
next=null;
}
}

void append(int data)
{
Node x=new Node(data);
if(head==null)
{
head=x;
return;
}
Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=x;
}

void print()
{
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}

void parts()
{
List[]=new Int
Node temp=head;
while
}

public static void main(String args[])
{
BinaryNumber b=new BinaryNumber();
b.append(1);
b.append(2);
b.append(3);
b.print();
b.parts();
}
}