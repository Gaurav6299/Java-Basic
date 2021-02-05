class swapPair
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

void swap()
{
Node temp=head;
while(temp!=null && temp.next!=null)
{
int k=temp.data;
temp.data=temp.next.data;
temp.next.data=k;
temp=temp.next.next;
}
}

public static void main(String args[])
{
swapPair s=new swapPair();
s.append(10);
s.append(20);
s.append(30);
s.append(40);
s.print();
s.swap();
System.out.println("After swaping the pair");
s.print();
}
}