// *****
// *   * 
// *   * 
// *****

public class pattern1 {
    public static void hallow_rec(int totalrows,int totalcol){
        for (int i=1; i <= totalrows; i++){

            for(int j=1; j <= totalcol; j++){

                if (i==1 || i==totalrows || j==1 || j==totalcol) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hallow_rec(4, 5);
    }
}
