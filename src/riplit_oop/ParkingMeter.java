package riplit_oop;

public class ParkingMeter {
    public int timeLeft;
    public int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int num){
        if (num==25 && timeLeft<maxTime){
            timeLeft+=30;
            return true;
        }else {
            return false;
        }

    }

    public void tick(){
        if (timeLeft>0){
            timeLeft--;
        }
    }

    public boolean isExpired(){
        if (timeLeft==0){
            return true;
        }
        return false;
    }
}
