class split
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

int ConvertDecimal()
{
Node temp=head;
int res=temp.data;
while(temp.next!=null)
{
res=res*2+temp.next.data;
temp=temp.next;
}
return res;
}

public static void main(String args[])
{
split s=new split();
s.append(1);
s.append(0);
s.append(1);
s.print();
System.out.println(s.ConvertDecimal());
}
}