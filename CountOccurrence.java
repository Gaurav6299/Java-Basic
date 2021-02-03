class CountOccurrence
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

void Occurrence(int key)
{
int count=0;
Node temp=head;
while(temp!=null)
{
if(temp.data==key)
{
count+=1;
}
temp=temp.next;
}
System.out.println("Number of occurrences is:"+count);
}

public static void main(String args[])
{
CountOccurrence l=new CountOccurrence();
l.append(1);
l.append(2);
l.append(1);
l.append(2);
l.append(1);
l.append(3);
l.append(1);
l.print();
l.Occurrence(1);
}
}