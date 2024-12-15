import java.util.Scanner;

public class arrOprations{

    public static void main(String[] args) {
        //craete
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        //input
        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//math
        marks[2] = sc.nextInt();//chem

        //output
        System.out.println("Phy :" + marks[0]);
        System.out.println("Math :" + marks[1]);
        System.out.println("Chem :" + marks[2]);

        //update
        marks[1] = sc.nextInt();//math
        System.out.println("MAth :" + marks[1]);
    }
}