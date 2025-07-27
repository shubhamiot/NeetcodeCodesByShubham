public class TwoSum {


    public static int[] twoSum(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){

                if(arr[i]== arr[j]) continue;

                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] ints = twoSum(arr, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
