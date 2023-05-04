
class Renault
{
    int gear;
    int currGear;
    int speed;
    int state;

    void changeState(int s)
    {
        state = s;
    }

    void getState()
    {
        if (state == 0)
        {
            System.out.println("Car in off state");
        }
        if (state ==1)
        {
            System.out.println("Car in on state");
        }
    }
}

public class CarApp
{
    public static void main(String[]args)
    {
        System.out.println("Car Application");
        Renault triber ;
        triber = new Renault();
        triber.getState();
        triber.changeState(1);
        triber.getState();

    }
}
