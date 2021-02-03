//Find the middle element using two pointer?
class FindMiddle1
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

void printMiddle()
{
Node fast=head;
Node slow=head;
if(head!=null)
{
while(fast!=null && fast.next!=null)
{
fast=fast.next.next;
slow=slow.next;
}
}
System.out.println("Middle Node is:"+slow.data);
}

void push(int data)
{
Node x=new Node(data);
x.next=head;
head=x;
}
public static void main(String args[])
{
FindMiddle1 f=new FindMiddle1();
f.push(10);
f.push(20);
f.push(30);
f.push(40);
f.print();
System.out.println("Print the middle elemnt");
f.printMiddle();

}
}