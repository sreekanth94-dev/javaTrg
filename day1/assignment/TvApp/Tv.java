
class LgTv{
    int state;
    int soundLevel;
    int channel;
    int brightnessLevel;
    String model;

    void setModel(String m){
        model = m;
    }

    void setState(int s){
        state = s;
    }

    void getModel(){
        System.out.println(model);
    }

    void getState(){
        
        if(state == 0)
        System.out.println("Tv is in off state");
        if(state == 1)
        System.out.println("Tv is in on state");
    }

    void getChannel(){
        System.out.println(channel);
    }

    void increaseSoundLevel(){

        if(soundLevel == 100){
            System.out.println("soundLevel is already 100 ");

        }else{
            soundLevel++;
            System.out.println(soundLevel);
        }
       
    }

    void decreaseSoundLevel(){
        if(soundLevel == 0){
            System.out.println("soundLevel is already 0 ");

        }else{
            soundLevel--;
        System.out.println(soundLevel);
        }
        

    }

    void increaseBrightnessLevel(){

        if(brightnessLevel == 100){
            System.out.println("brightnessLevel is already 100 ");

        }else{
            brightnessLevel++;
            System.out.println(brightnessLevel);
        }
       
    }

    void decreaseBrightnessLevel(){

        if(brightnessLevel == 0){
            System.out.println("brightnessLevel is already 0 ");

        }else{
            brightnessLevel--;
            System.out.println(brightnessLevel);
        }
    }



    void changeToNextChannel(){
        channel ++;
    }

    void changeToPreviousChannel(){
        channel --;
    }
}


class Tv
{
    public static void main(String[]args){
        System.out.println("Tv Application");

        LgTv abc = new LgTv();
        
        abc.getState();
        abc.setState(1);
        abc.getState();
        abc.setModel("abc123");
        abc.getModel();
        abc.increaseSoundLevel();
        abc.decreaseBrightnessLevel();
        abc.increaseBrightnessLevel();
    }
}