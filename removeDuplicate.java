class removeDuplicate
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

void remove()
{
Node temp=head;
while(temp!=null)
{
Node prev=temp;
while(prev!=null && temp.data==prev.data)
{
prev=prev.next;
}
temp.next=prev;
temp=temp.next;
}

}

void print()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}

public static void main(String args[])
{
removeDuplicate r=new removeDuplicate();
r.push(30);
r.push(20);
r.push(10);
r.push(10);
r.remove();
r.print();
}
}