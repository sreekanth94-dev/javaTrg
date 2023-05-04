class JavaStack {
    int[] stackArray = new int[3];
    int sp = 0;

    void push(int n) {
        if (sp ==3){
            System.out.println("Stack is full");
        }else{
            stackArray[sp] = n;
            sp++;
        }
       
    }

    void pop() {
        if (sp == 0){
            System.out.println("Stack is empty");
        }else{
            sp--;
            System.out.println(stackArray[sp]);
        }
        

    }
}
public class Stack {
    public static void main(String[] args) {
        JavaStack js;
        js = new JavaStack();
        js.push(10);
        js.push(20);
        js.push(30);
        js.push(40);
        js.pop();
        js.pop();
        js.pop();
        js.pop();
    }
}

