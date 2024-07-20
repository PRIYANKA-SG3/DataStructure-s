import java.util.Scanner;
class abi
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    void insert(int val)
    {
        Node nn=new Node(val);
        if(head==null)
        {
            head=nn;
            head.next=nn;
        }
        else
        {
        nn.next=head.next;
        head.next=nn;
        //head=nn;
        }
    }
    void dpos(int val)
    {
        Node temp1=head.next;
        Node temp2=head.next;
        //int z=0;
        if(temp1.data==val)
        head.next=temp1.next;
        else
        {
        for(temp1=head.next.next;temp1!=head;temp1=temp1.next)
            {
                //temp2=head.next;
            /*if(temp1.data!=val&& temp1!=head)
            {
                z=1;
                break;
            }/*/
            if(temp1.data==val)
            {
                //if(temp1==head){
                //temp2=head;}
                temp2.next=temp1.next;
                //temp1.next=null;
               // break;
            }
            //temp1=temp1.next;
            temp2=temp2.next;
        }
        //if(z==1)
        //System.out.print("Element not Found");
    }
    }
        void display(){
            System.out.println();
        Node temp=head.next;
        do{
        System.out.print(temp.data+" --> ");
        temp=temp.next;
        }
        while(temp!=head.next);
        System.out.print("Null\n\n");
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
    int val=s.nextInt();
    l.display();
    l.dpos(val);
    System.out.println();
    l.display();
}
    
}
