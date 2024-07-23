class stack
{
    int s [] = new int[9];
    int res []=new int[10]
    int tops=-1;
    int topres=-1;
    
    //stack(){
      //  top = -1;
    //}
    int pri(char a)
    {
        if(a=='*'|| a=='/')
        return 2;
        if(a=='+'||a=='-')
        return 1;
        if(a=='^')
        return 3;
    }
    void push(char val){
        if(top ==8){
            System.out.println("full");
        }
        s[++tops] = val;
    }
    void pop(){
        if(top>=0)
        {
            tops=tops-1;
        
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
        
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=1;i<=str.length;i++)
        {
        char ch = str. charAt(1);
        if(a=='^'||a=='-'||a=='+'||a=='*'||a=='/')
        {
            int a=a1.pri(ch);
            
        }
    }
}
