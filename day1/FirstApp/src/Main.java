public class Main {
    public static void main(String[] args)
    {
        double money ;
        money = 50;

        if(money < 10){
            System.out.println("Go by walk!");
        } else if (money > 10 && money < 25) {
            System.out.println("Go by bus!");

        }else if (money > 25 && money < 50) {
            System.out.println("Go by metro!");

        }else if (money >= 50) {
            System.out.println("Go by cab!");
        }

    }
}