public class reverseArray {
    
    public static void reverseArray(int numbers[]){
        int start=0, end=numbers.length -1;

        while (start < end) {
            //swap
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end --;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,5,6,8,20,25};

        reverseArray(numbers);
        for(int i=0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
