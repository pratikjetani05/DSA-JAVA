public class funOverloading {
    
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5, 4)); 
        System.out.println(sum(2.5f, 2.5f));
        
    }
}
