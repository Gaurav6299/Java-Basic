class reverseLink
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
reverseLink r=new reverseLink();
r.append(10);
r.append(20);
r.append(30);
r.append(40);
r.print();
System.out.println("reverse Linkedlist");
r.reverse();
}
}