//     1
//    212
//   32123
//  4321234
// 543212345


public class pattern11 {
    
    public static void palindromicPattern(int n){

        for(int i=1; i<=n;i++){
            //spaces
            for(int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }

            //number with palindrom
            //descding order number loop
            for(int j=i; j>=1 ; j--){
                System.out.print(j);
            }
            //ascending order loop
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromicPattern(5);
    }
}
