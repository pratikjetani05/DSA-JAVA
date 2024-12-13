public class bianomial {
    public static int factorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact = fact * i;

        }
        return fact;

    }

    public static int bianomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);

        int bc = fact_n/(fact_r * fact_n_r);
        return bc;
    }
    public static void main(String[] args) {
        int f=bianomial(5,2);
        System.out.println("Bianomial coofficient:"+f);
    }
}
