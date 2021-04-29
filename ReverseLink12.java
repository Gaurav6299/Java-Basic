class ReverseLink12
{
Node head;
class Node
{
Node next;
int data;
Node(int d)
{
data=d;
next=null;
}
}

void append(int data)
{
Node n=new Node(data);
if(head==null)
{
head=n;
return;
}

Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=n;
}

void print(){

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
ReverseLink12 r=new ReverseLink12();
r.append(10);
r.append(11);
r.append(12);
r.append(13);
r.print();
}
}