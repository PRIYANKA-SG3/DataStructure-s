void change()
  {
    int a;
    a=head.next.data;
    head.next.data=head.data;
    head.data=a;
  }

void sll_cll()
  {
    Node temp=head;
    while(temp!=head)
    temp=temp.next;
    temp.next=head;
  }
