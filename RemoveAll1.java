class RemoveAll1
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
public static void main(String args[])
{
RemoveAll1 r=new RemoveAll1();
r.append(1);
r.append(2);
r.append(3);
r.append(3);
r.append(4);
r.print();
}
}