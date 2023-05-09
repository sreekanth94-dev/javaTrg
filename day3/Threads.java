

class Reader extends Thread{
    public void run(){

        int i;
        for(i = 0 ; i< 10 ; i++){
            System.out.println("Reader");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ii) {}
        }

        
    }
}

class Writer extends Thread{
    public void run(){

        int i;
        for(i = 0 ; i< 10 ; i++){
            System.out.println("Writer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ii) {}
        }

        
    }
}

public class Threads {
    public static void main(String[] args) {
        
        Writer w = new Writer();
        Reader r = new Reader();

        w.start();
        r.start();


    }    
}
