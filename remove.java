import java.util.*;
class remove
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

void remove()
{
HashSet<Integer> s=new HashSet<>();
Node temp=head;
Node prev=null;
while(temp!=null)
{
if(s.contains(temp.data))
prev.next=temp.next;
else
{
s.add(temp.data);
prev=temp;
}
temp=temp.next;
}
}

public static void main(String args[])
{
remove r=new remove();
r.append(20);
r.append(10);
r.append(30);
r.append(10);
r.append(40);
r.print();
r.remove();
System.out.println("\nAfter removing the data");
r.print();
}
}