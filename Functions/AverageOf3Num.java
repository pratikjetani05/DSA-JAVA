public class AverageOf3Num {
    public static void Average(int a,int b,int c){
        int sum = a + b +c ;
        double avg = sum / 3 ;
        System.out.println("Average is :" + avg);
    }
    
    public static void main(String[] args) {
        Average(5, 4, 3);
    }
}
