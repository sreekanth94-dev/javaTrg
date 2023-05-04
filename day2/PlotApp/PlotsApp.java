class plot{
    private int width;
    private int height;

    void setDimensions(int w,int h){
        width = w;
        height = h;
    }

    void getDimensions(){
       System.out.println("Plot has dimensions of "+width+"X"+height);
    }
}

public class PlotsApp {
    public static void main(String [] args){
        plot p1 = new plot();
        plot p2 = new plot();
        plot p3 = new plot();

        p1.setDimensions(10, 20);
        p1.getDimensions();
        p2.setDimensions(30, 60);
        p2.getDimensions();p1.setDimensions(10, 20);
        p3.setDimensions(70, 80);
        p3.getDimensions();

    }
}
