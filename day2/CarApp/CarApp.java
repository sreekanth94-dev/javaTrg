
class Car{
     String name;
     String colour;
     double cost;

    Car(){
        System.out.println("Default");
    }

    Car(String n,String c,int price){
        name = n;
        colour= c;
        cost = price;
    }

    void getName(){
        System.out.println(name);
    }

    void getColor(){
        System.out.println(colour);
    }

    void getCost(){
        System.out.println(cost);
    }
}

class Renault extends Car{
    
    int noOfSeats;
    String state ;

    Renault(){
       System.out.println("at derived");
    }

    Renault(int n,String s){
        noOfSeats = n;
        state = s;
    }

    Renault(String n,String co,int price,int no,String S){
        super(n, co, price);
        noOfSeats = no;
        state =S;
    }

    void getState(){
        System.out.println(state);
    }

}


public class CarApp {
    public static void main(String []args){
        
        Renault kwid ;
        kwid = new Renault();
        kwid = new Renault("abc", "blue", 10000, 4, "on");

        kwid.getCost();
        kwid.getState();
        kwid.getName();

    }
}
