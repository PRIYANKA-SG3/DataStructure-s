import java.util.Scanner;
class doublell
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
    doublell()
    {
        head=null;
        tail=null;
    }
<-- // inserting a node at end // -->
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head==null){
            head = newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
           }
    }
<-- // inserting a node at position // -->
    public void middle(int pos,int k)
    {
        Node newnode=new Node(k);
        Node temp=head;
        for(int i=0;i<pos;i++)
        temp=temp.next;
        
        newnode.prev=temp;
        newnode.next = temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        
        
    }
    public void display()
    {
        Node temp=head;
         //System.out.print("Null");
        while(temp!=null)
        {
             System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        doublell list = new doublell();
        int n = s.nextInt();
        for (int i =0 ;i<n;i++){
            int val = s.nextInt();
            list.insertend(val);
    }
<--// inserting a node at end // -->
    list.display();
<--//  inserting a node at position // -->
    int k=s.nextInt();
    int pos=s.nextInt();
    list.middle(pos,k);
    list.display();
}
}
