

class Animal{
   static String name;
    String color;

    Animal(String n,String c){
        name = n;
        color = c;
    }

    public  String getColor() {
        return color;
    }

    public  String getName() {
        return name;
    }
}


public class Sample {
    public static void main(String[] args) {
        Animal dog = new Animal("rocky", "brown");

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        Animal cat = new Animal("cat", "white");

        System.out.println(cat.getName());
        System.out.println(cat.getColor());

        
        System.out.println(dog.getName());

        

    }
}
