class FindSecond
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

void findKth(int k)
{
Node fast=head;
Node slow=head;

for(int i=0;i<k;i++)
{
fast=fast.next;
}

while(fast!=null)
{

slow=slow.next;
fast=fast.next;
}
System.out.println("Second Element is:"+slow.data);
}

public static void main(String args[])
{
FindSecond f=new FindSecond();
f.append(10);
f.append(20);
f.append(30);
f.append(40);
f.append(50);
f.print();
f.findKth(2);
}
}
