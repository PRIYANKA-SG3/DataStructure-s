class stack
{
    int s [] = new int[9];
    int top=-1;
    
    //stack(){
      //  top = -1;
    //}
    void push(int val){
        if(top ==8){
            System.out.println("full");
        }
        s[++top] = val;
    }
    void pop(){
        if(top>=0)
        {
            top=top-1;
        
            //s[top--];
        }
    }
    void peak(){
        System.out.println("Peak = "+s[top]);
    }
    void display(){
        for(int i =0;i<=top;i++){
            System.out.print(s[i]+ " ");
        }
    }
    public static void main(String args[]){  
        stack a1 = new stack();
        
        a1.push(10);
        a1.push(20);
        a1.push(30);
        a1.push(40);
        a1.push(50);
        a1.push(60);
        a1.push(70);
        a1.push(80);
        a1.push(90);
        a1.display();
        
        System.out.println();
        a1.pop();
        a1.pop();
        a1.display();
        
        a1.peak();
        
    }
}
