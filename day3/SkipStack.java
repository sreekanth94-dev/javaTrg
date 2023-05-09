
public class SkipStack {

    public static void fun4(){
        System.out.println("inside fun4()");
    }

    public static void fun3(){
        fun4();
        System.out.println("inside fun3()");
    }

    public static void fun2(){
        fun3();
        System.out.println("inside fun2()");
    }


    public static void fun1(){
        fun2();
        System.out.println("inside fun1()");
    }

    public static void main(String[] args) {
        fun1();
        System.out.println("inside main()");

    }
}
