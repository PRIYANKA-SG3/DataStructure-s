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
