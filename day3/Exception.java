
public class Exception {


    public static double divide(int a ,int b){
        return a/b;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int array [] = {1,2};

        try {

            double ret = divide(a, b);
            System.out.println(ret);

            int n = array[2];

        } catch (ArithmeticException e) {
            System.out.println(e);    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);    
        }
    }
}
