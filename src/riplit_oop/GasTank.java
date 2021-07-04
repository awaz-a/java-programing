package riplit_oop;

public class GasTank {
    public double amount = 0;
    public double capacity;



    public GasTank(double capacity){
        this.capacity = capacity;
    }

    public void addGas(double sum){

        if (amount+sum > capacity){
            amount = capacity;
        }else {
            amount+=sum;
        }
    }

    public void useGas(double sum){
        if (amount-sum<0){
            amount=0;
        }else {
            amount-=sum;

        }
    }
    public boolean isEmpty(){
        return amount<0.1;
    }

    public boolean isFull(){
        return amount>capacity-0.1;
    }

    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        double difference =  amount - capacity;
        amount=capacity;
        return difference;
    }



}
