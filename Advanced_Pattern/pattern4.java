// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class pattern4 {
    public static void floyd_tringle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                // here counter is number that we want print or show in ouput
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd_tringle(4);
    }
}
