class cycle
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

boolean check(Node head)
{
if(head==null || head.next==null)
{
return false;
}
Node A=head;
Node B= head.next;
while(A!=B)
{
if(B==null || B.next==null)
return false;
else{
A=A.next;
B=B.next.next;
}
}
return true;
}

public static void main(String args[])
{
cycle c=new cycle();
c.append(10);
c.append(20);
c.append(30);
c.append(40);
c.print();
System.out.println(c.check(head));
}
}