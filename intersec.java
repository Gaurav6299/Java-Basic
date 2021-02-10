import java.util.*;
class intersec
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

intersec intersection(Node head1,Node head2)
{
if(head1==null && head2==null)
{
System.out.println("null");
}
Node temp1=head1;
Node temp2=head2;
HashSet<Integer> set=new HashSet<>();
intersec s3=new intersec();
while(temp1!=null)
{
set.add(temp1.data);
temp1=temp1.next;
}

while(temp2!=null)
{

if(set.contains(temp2.data))
{
s3.append(temp2.data);
}
temp2=temp2.next;
}
return s3;
}
public static void main(String args[])
{
intersec s=new intersec();
intersec s1=new intersec();

intersec l1=new intersec();
intersec l2=new intersec();

s.append(10);
s.append(20);
s.append(30);
s.append(40);
System.out.println("first list is:");
s.print();
System.out.println("Second list is:");
s1.append(10);
s1.append(25);
s1.append(40);
s1.print();
System.out.println("Intersection of two linkedlist");
l2=l1.intersection(s.head,s1.head);
l2.print();
}
}