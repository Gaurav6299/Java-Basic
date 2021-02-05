import java.util.*;
class remove1
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
void push(int data)
{
Node x=new Node(data);
x.next=head;
head=x;
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
Node temp=head;
Node prev=null;
HashSet<Integer> s=new HashSet<>();
while(temp!=null)
{
if(s.contains(temp.data))
{
prev.next=temp.next;
}
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
remove1 r=new remove1();
r.push(40);
r.push(30);
r.push(20);
r.push(30);
r.push(20);
r.push(25);
r.print();
r.remove();
System.out.println("\nAfter removing the data");
r.print();
}
}
