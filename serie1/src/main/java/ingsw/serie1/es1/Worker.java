package ingsw.serie1.es1;

public class Worker{

    private final int startingValue;

    public Worker(int startingValue) {
        this.startingValue = startingValue;
    }

    public int getStartingValue() {
        return startingValue;
    }

    protected static int  conversion(int value){
        if(value % 2 != 0){
            return (3 * value) + 1;
        }
        return value / 2;
    }

    public int sequence(){
        if(startingValue <= 2){
            throw new IllegalArgumentException("Starting value cannot be less than 2");
        }
        int length = 0;
        int currentValue = startingValue;
        while(currentValue >  1){
               currentValue = conversion(currentValue);
               length++;
        }
        return length;
    }

}
