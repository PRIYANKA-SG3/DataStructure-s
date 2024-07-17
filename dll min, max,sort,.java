import java.util.Scanner;
class abi
{
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            next=null;
            prev=null;
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
            tail=newnode;
        }
    }
    public void min()
    {    
        int min=head.data;
        Node temp=head;
        while (temp != null)
        {
            if (min>temp.data) 
            min=temp.data;
            temp=temp.next;
        }
        System.out.println("Min="+min);
    }
    public void max()
    {    
        int max=head.data;
        Node temp=head;
        while (temp != null)
        {
            if (max<temp.data) 
            max=temp.data;
            temp=temp.next;
        }
        System.out.println("Max="+max);
    }
    public void sort()
    {
        if(head==tail)
        return;
        else
        {
            Node curr=head;
        Node index=null;
        int temp;
        for(curr=head;curr!=null;curr=curr.next)
        {
            index=curr.next;
            for(index=curr.next;index!=null;index=index.next)
            {
                if(curr.data>index.data)
                {
                    temp=curr.data;
                    curr.data=index.data;
                    index.data=temp;
                }
                
            }
        }
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        abi l=new abi();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=s.nextInt();
            l.insert(val);
        }
        l.display();
        System.out.println("Sort:");
        l.sort();
        l.display();
        l.min();
        l.max();
    }
}
