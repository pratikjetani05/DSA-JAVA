public class binarySearch {
    
    public static int binarySearch(int numbers[],int key){
        int start=0,end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){//right
                start = mid +1;
            }else{//left
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,5,6,8,9,12,15,18,20,25};
        int key = 20;
        int index = binarySearch(numbers, key);

        System.out.println("Key of index is:" + index);
    }
}
