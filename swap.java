class swap
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
System.out.println();
}

Node swapData(Node head,int x,int y)
{
Node temp=head;
Node a=null;
Node b=null;
while(head.next!=null)
{
if((head.next).data==x)
{
a=head.next;
}
else if((head.next).data==y)
{
b=head.next;
}
head=head.next;
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
return temp; 
}

public static void main(String args[])
{
swap s=new swap();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.print();
s.swapData(head,40,20);
s.print();
}
}