class swapNodes1
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

void swap(Node head,int x,int y)
{
Node temp=head;
if(x==y)
System.out.println("null");

Node a=null;
Node b=null;
while(temp.next!=null)
{
if((temp.next).data==x)
{
a=temp;
}
else if((temp.next).data==y)
{
b=temp;
}
temp=temp.next;
}
if(a!=null && b!=null)
{
Node k=a.next;
a.next=b.next;
b.next=k;
k=a.next.next;
a.next.next=b.next.next;
b.next.next=k;
}
temp=head;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}

public static void main(String args[])
{
swapNodes1 s=new swapNodes1();
s.append(10);
s.append(30);
s.append(20);
s.append(60);
s.print();
s.swap(head,30,20);
}
}