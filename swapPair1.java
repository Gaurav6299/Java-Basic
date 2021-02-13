class swapPair1
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

Node swap()
{
Node temp=head;

while(temp!=null && temp.next!=null)
{
int x=temp.data;
temp.data=temp.next.data;
temp.next.data=x;
temp=temp.next.next;
}
return head;
}

public static void main(String args[])
{
swapPair1 s=new swapPair1();
s.push(10);
s.push(20);
s.push(30);
s.print();
Node k=s.swap();
s.print();
}
}