class FindMiddle
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
int count=0;
Node temp=head;
while(temp!=null)
{
count+=1;
temp=temp.next;
}
temp=head;
for(int i=0;i<count/2 && temp!=null;i++)
{
temp=temp.next;
}
System.out.println(temp.data);
}

public static void main(String args[])
{
FindMiddle f=new FindMiddle();
f.append(10);
f.append(20);
f.append(30);
f.append(40);
f.append(60);
f.append(90);
f.print();
}
}