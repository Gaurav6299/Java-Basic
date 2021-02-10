import java.util.*;
class Intersect
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

Intersect intersection(Node head1,Node head2)
{
Node temp1=head1;
Node temp2=head2;
HashSet<Integer> set=new HashSet();
Intersect s=new Intersect();
while(temp1!=null)
{
set.add(temp1.data);
temp1=temp1.next;
}

while(temp2!=null)
{
if(set.contains(temp2.data))
{
s.append(temp2.data);
}
temp2=temp2.next;
}

return s;
}

public static void main(String args[])
{
Intersect s1=new Intersect();
Intersect s2=new Intersect();
Intersect s3=new Intersect();


s1.append(10);
s1.append(20);
s1.append(30);
s1.append(33);
System.out.println("First List is");
s1.print();

s2.append(20);
s2.append(30);
s2.append(34);
System.out.println("Second List is:");
s2.print();

Intersect k=s3.intersection(s1.head,s2.head);
System.out.println("Intersection of two list");
k.print();
}
}