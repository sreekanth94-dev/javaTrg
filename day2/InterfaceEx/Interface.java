interface Maruthi{
    void engine();
}

interface GearType{
    void gearType();
}

class Car implements Maruthi,GearType{

    public void engine(){
        System.out.println("Car.engine()");
    }

    public void gearType(){
        System.out.println("Car.gearType()");
    }
}

class Kwid extends Car{
    String color ;

    Kwid(String col){
        color = col;
    }

    String getColor() {
        return color;
    }
}


public class Interface {
    public static void main(String[]args){
        Kwid abc = new Kwid("red");
        abc.engine();
        System.out.println(abc.getColor());

    }
}
