public class prime_number{
    public static void main(String[] args) {
        int n=5;
        int div = 2;

        while(div<n){
            if(n % div == 0){
                System.out.println("It is not a prime number");
                return ;
            }else{
                div = div + 1;
            }
        }
        System.err.println("It is prime number");

    }
}