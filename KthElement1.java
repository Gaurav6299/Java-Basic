class KthElement1
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

int findKth(int k)
{
Node slow=head;
Node fast=head;
for(int i=0;i<k;i++)
{
fast=fast.next;
}

while(fast!=null)
{
slow=slow.next;
fast=fast.next;
}
return slow.data;
}

public static void main(String args[])
{
KthElement1 k=new KthElement1();
k.append(10);
k.append(20);
k.append(30);
k.append(40);
k.print();
int l=2;
int x=k.findKth(l);
System.out.println(x);
}

}
