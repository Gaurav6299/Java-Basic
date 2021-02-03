class CheckPalin
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
Stack<Integer> s=new Stack<>();
while(temp!=null)
{
s.push(temp.data);
temp=temp.next;
}
}

public static void main(String args[])
{
CheckPalin p=new CheckPalin();
p.push(10);
p.push(20);
p.push(30);
p.print();
}
}