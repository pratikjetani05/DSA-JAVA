public class linearSearch {
    public static int linearSearch(int numbers[],int key){

        for(int i=0; i <= numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }    

    public static void main(String[] args) {
        int numbers[] = {2,5,6,8,9,12,15,18,20,25};
        int key = 12;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not founded");
        }else{
            System.out.println("Index is :" + index);
        }
    }
}
