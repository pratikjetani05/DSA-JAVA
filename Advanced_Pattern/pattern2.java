//    *
//   ** 
//  ***
// ****


public class pattern2 {
    
    public static void half_piramid(int n){

        for (int i=1; i <= n ;i++){
            //spaces
            for (int j=1; j<= n-i  ;j++){
                    System.out.print(" "); 
            }
            //stars
            for(int j=1; j <= i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        half_piramid(4);
    }
}
