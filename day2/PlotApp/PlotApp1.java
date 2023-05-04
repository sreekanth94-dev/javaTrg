

class Plot{
    int width;
    int length;

     Plot(){
        System.out.println("Default Constructor");
        width = 30;
        length = 10;
    }

     Plot(int w){
        System.out.println("One Argument Constructor");
        width = w;
        // length = 10;
    }

     Plot(int w ,int l){
        System.out.println("Two Arguments Constructor");
        width = w;
        length = l;
    }

    void get(){
        System.out.println(width+ "X" + length);
        
    }
}



public class PlotApp1 {
    public static void main(String[]args){

        Plot p1 = new Plot();
        p1.get();

        Plot p2 = new Plot(10);
        p2.get();

        Plot p3 = new Plot(10,30);
        p3.get();

    } 
}
