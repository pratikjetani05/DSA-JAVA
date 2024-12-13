public class callTypes{
    //call by value in another way COPY OF VALUE
    //call by value-if in the swap fun we declare the parametrs and that belog to that function only
    //if we access in the main function the original value variable are access back .
    
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;

        System.out.println("a:" + a);
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a, b);
        // System.out.println("a:" + a);
        // System.out.println("b:"+b);
        
    }
}