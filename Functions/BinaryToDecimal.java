public class BinaryToDecimal {

    public static void binToDec(int binNum){
        
        int MyNum= binNum;
        int pow=0;
        int decNum=0;

        while (binNum >0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum /10;
        }
        System.out.println("Binary of " + MyNum + " is == "+decNum);
    }    
    public static void main(String[] args) {
        binToDec(111);
    }
}