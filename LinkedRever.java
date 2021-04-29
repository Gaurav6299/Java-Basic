class LinkedRever
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
Node prev=null;
Node next=null;
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
LinkedRever l=new LinkedRever();
l.append(10);
l.append(20);
l.append(30);
l.append(40);
l.print();
l.reverse();
}
}