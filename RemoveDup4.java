class RemoveDup4
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
Node temp=head;
Node prev=null;
ArrayList<Integer> l=new ArrayList<>();
while(temp!=null)
{
if(l.contains(temp.data))
{
prev.next=temp.next;
temp=temp.next;
}
else
{
l.add(temp.data);
prev=temp;
temp=temp.next;
}
}
}

public static void main(String args[])
{
RemoveDup4 r=new RemoveDup4();
r.append(5);
r.append(3);
r.append(3);
r.append(4);
r.append(10);

r.print();
r.remove();
}
}