import java.util.*;
public class largetInArray {
    
    public static int getLarget(int numbers[]){
        int larget = Integer.MIN_VALUE; // -infinity

        for(int i=0; i < numbers.length; i++){

            if( larget < numbers[i]){
                larget = numbers[i];
            }
        }
        return larget;
    }
    public static void main(String[] args) {
        int numbers[] = {2,1,6,8,5,4};

        int lag = getLarget(numbers);
        System.out.println("LArget number is :" + lag);

    }
}
