public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,6};
        int largest = largestNumber(arr);
        System.out.println(largest);
    }

    public static int largestNumber(int[] arr){
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
