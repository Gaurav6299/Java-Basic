class DeleteNode
{
Node head;
static class Node
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

boolean isPalindrome()
{
Node temp=head;
boolean isPalin=false;
Stack<Integer> s=new Stack<>();
while(temp!=null)
{
s.push(temp.data);
temp=temp.next;
}
temp=head;

while(temp!=null)
{
if(temp.data==s.pop())
{
isPalin=true;
}
else
{
isPalin=false;
break;
}
temp=temp.next;
}
return isPalin;
}

public static void main(String args[])
{
DeleteNode s=new DeleteNode();
s.append(10);
s.append(11);
s.append(10);
s.print();
System.out.println(s.isPalindrome());
}
}