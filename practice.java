import java.util.Scanner;
class stack
{
    char s [] = new char[20];
    char res []=new char[20];
    int tops=-1;
    int topres=-1;
    
    //stack(){
      //  top = -1;
    //}
    void pop(){
        if(tops>=0)
        {
            char temp=s[tops];
            pushres(temp);
            tops=tops-1;
        
            //s[top--];
        }
    }
     void pushres(char val) {
    if (topres == 19) {
        System.out.println("full");
    }
    res[++topres] = val;  
}

     void push(char val){
        if(tops ==19){
            System.out.println("full");
        }
        s[++tops] = val;
    }
    int check(char ch)
    {
        if(ch=='*'||ch=='/')
        return 2;
        if(ch=='+'||ch=='-')
        return 1;
        if(ch=='^')
        return 3;
        return 0;
    }
    
   void transfer(String str) {
    for (int i = 0; i < str.length(); i++) {
        int val, val2;
        char ch = str.charAt(i);
        if (ch == '*' || ch == '/' || ch == '^' || ch == '+' || ch == '-') {
            val = check(ch);
            if (tops >= 0) 
                val2 = check(s[tops]);
            else 
                val2 = -1;
            if (val > val2)
                push(ch);
            else 
            {
                while (tops >= 0 && val <= check(s[tops])) 
                    pop();
                push(ch);
            }
        } 
        else 
        {
            pushres(ch);
        }
    }
    while (tops >= 0) 
      pop();
    
}

    
    void display(){
        for(int i =0;i<=topres;i++){
            System.out.print(res[i]);
        }
    }
    public static void main(String args[]){  
        stack a1 = new stack();
        
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        a1.transfer(str);
        a1.display();
    }
}
