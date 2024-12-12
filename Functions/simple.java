import java.util.Scanner;

public class simple {
    
    // public static void hello(){
    //     System.out.println("Hello Pratik");
    //     return;
    // }

    public static void calc(int n1,int n2){//parameters or formal parameters
        int sum = n1 + n2;
        System.out.println("Sum is:" + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        calc(a,b);//arguments or actual parameters
    }
}
