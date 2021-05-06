class KthElementFirst
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


void findKth(int k)
{
Node temp=head;
for(int i=1;i<k;i++)
{
temp=temp.next;
}
System.out.println(temp.data);
}

public static void main(String args[])
{
KthElementFirst k=new KthElementFirst();
k.append(10);
k.append(20);
k.append(30);
k.print();
k.findKth(3);
}
}