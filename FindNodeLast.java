class FindNodeLast
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

void print()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}

int findValue(int pos)
{
Node temp=head;
int len=0;
while(temp!=null)
{
len+=1;
temp=temp.next;
}

if(pos>len)
{
return -1;
}
temp=head;
for(int i=1;i<len-pos+1;i++)
{
temp=temp.next;
}
return temp.data;
}

public static void main(String args[])
{
FindNodeLast l=new FindNodeLast();
l.push(10);
l.push(20);
l.push(30);
l.push(40);
l.print();
System.out.println("Find the value at the given index:"+l.findValue(3));

}
}