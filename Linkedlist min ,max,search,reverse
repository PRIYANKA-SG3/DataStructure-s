import java.util.Scanner;
public class Linkedlist{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Linkedlist(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
         
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
    public void min(){    
        int min=head.data;
        Node temp=head;
        while (temp != null){
            if (min>temp.data) {
            min=temp.data;}
            temp=temp.next;
}
    System.out.println("Min IN LIST:"+min);
}
public void max(){    
        int max=head.data;
        Node temp=head;
        while (temp != null){
            if (max<temp.data) {
            max=temp.data;}
            temp=temp.next;
}
    System.out.println("MAX IN LIST:"+max);
}
public void search(int a) {
        Node temp = head;
        boolean found = false;
        
        while (temp != null) {
            if (temp.data == a) {
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (found)
            System.out.println("The element is found");
        else
            System.out.println("Not found");
    }
    public void reverse()
    {
        Node prev = null;
        Node current = head;
        //Node next = current.next;
        while (current != null){
            Node next = current.next ;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.display();
        System.out.println();
        list.min();
        System.out.println();
        list.max();
        System.out.println();
        System.out.print("the element to search:");
        int val=sc.nextInt();
        list.search(val);
        System.out.println();
        System.out.print("Reverse:");
        list.reverse();
        list.display();
    }
}
