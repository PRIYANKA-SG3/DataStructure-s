import java.util.Scanner;
class abi
{
  Node head;
  Node tail;
  class Node
  {
    int data;
    Node next=null;
    Node prev=null;
    Node(int val)
    {
      data=val;
      next=null;
      prev=null;
    }
  }
  abi()
  {
    head=null;
    tail=null;
  }
    void sort()
  {
    Node temp1;
    Node temp2;
    int data;
    for(temp1=head;temp1!=null;temp1=temp1.next)
    {
      for(temp2=temp1.next;temp2!=null;temp2=temp2.next)
      {
        data=temp1.data;
        temp1.data=temp2.data;
        temp2.data=data;
    }
  }
}
void dup()
{
  if(head==null)
  return;
  Node temp1=head;
  Node temp2=temp1.next;
  while(temp1!=null)
  {
    if(temp1.data==temp2.data)
    {
      temp1.next=temp2.next;
      temp2.next.prev=temp1;
    }
    temp1=temp1.next;
    temp2=temp2.next;
  }
}
  public void insert(int val)
  {
    Node newnode=new Node(val);
    if(head==null)
    {
      head=newnode;
      tail=newnode;
    }
    else
    {
      tail.next=newnode;
      newnode.prev=tail;
      tail=tail.next;
    }
  }
  public void check()
  {
    Node temp1=head;
    Node temp2=tail;
    int z=0;
    while(true)
    {
      if(temp1.data!=temp2.data)
      {
        z=1;
        break;
      }
    temp1=temp1.next;
    temp2=temp2.prev;
    if(temp1==null && temp2==null)
    break;
  }
  if(z==0)
  System.out.print("Palindrome");
  else
  System.out.print("Not a Palindrome");
}
public static void main(String[]args)
{
  Scanner s=new Scanner(System.in);
  abi l=new abi();
  while(true)
  {
    int val=s.nextInt();
    if(val<0)
    break;
    l.insert(val);
  }
  l.check();
}
}
