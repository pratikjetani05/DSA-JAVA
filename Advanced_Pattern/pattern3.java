// 12345
// 1234
// 123
// 12
// 1

public class pattern3 {
    
    public static void half_piramid_number(int n){

        for(int i = 1; i <= n; i++ ){

            for(int j=1; j<= (n - i +1); j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_piramid_number(5);
    }
}
