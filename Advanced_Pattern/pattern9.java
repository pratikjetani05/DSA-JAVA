//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

public class pattern9 {
    
    public static void diamond(int n){
        //1 half
        for(int i=1;i <= n; i++){
            //space
            for(int j=1; j <= n-i  ;j++){
                System.out.print(" ");
            }

            //star 
            //here we print odd number of stars
            //in maths odd number we find out with 2x+1 and 2x-1
            for(int j=1;j <= (2*i-1);j++ ){
                    System.out.print("*");
            }
            System.out.println();
        }

        //2 half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j <= n-i  ;j++){
                System.out.print(" ");
            }

            //star 
            for(int j=1;j <= (2*i-1);j++ ){
                    System.out.print("*");
            }
            System.out.println();
        }
 
    }
    
    public static void main(String[] args) {
        diamond(4);
    }
}
