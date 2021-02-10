import java.util.*;
class Point1
{
static Node head;
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

static void intersection(Node head1,Node head2)
{
Node temp1=head1;
Node temp2=head2;
Set<Node> set=new HashSet<>();

while(temp1!=null)
{
set.add(temp1);
temp1=temp1.next;
}

while(temp2!=null)
{
if(set.contains(temp2))
{
System.out.println(temp2.data);
break;
}
temp2=temp2.next;
}

}

public static void main(String args[])
{
Point1 p1=new Point1();
p1.append(4);
p1.append(1);
p1.append(8);
p1.append(4);
p1.append(5);
p1.print();

Point1 p2=new Point1();
p2.append(5);
p2.append(6);
p2.append(1);
p2.append(8);
p2.append(4);
p2.append(5);
p2.print();

Point1 p3=new Point1();
intersection(p1.head,p2.head);
}
}