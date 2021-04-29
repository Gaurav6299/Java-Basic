class ReverseLinked12
{
Node head;
class Node
{
Node next;
int data;
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


void reverse()
{
Node temp=head;
Node next=null;
Node prev=null;
while(temp!=null)
{
next=temp.next;
temp.next=prev;
prev=temp;
temp=next;
}

temp=prev;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}

public static void main(String args[])
{
ReverseLinked12 l=new ReverseLinked12();
l.append(10);
l.append(11);
l.append(12);
l.append(13);
l.print();
l.reverse();
}
}