class IntersecionPoint
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

public static void main(String args[])
{
IntersectionPoint i=new IntersectionPoint();
i.append(3);
i.append(6);
i.append(9);
i.append(15);
i.append(30);
i.print();
}
}