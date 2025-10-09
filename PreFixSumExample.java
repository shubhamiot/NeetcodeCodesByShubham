import java.util.Arrays;

public class PreFixSumExample {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        int[] arr1 = prefixSum(arr);
        System.out.println(Arrays.toString(arr1));

    }

    private static int[] prefixSum(int[] arr) {
        int[] newArr = new int[arr.length];
        newArr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            newArr[i] = newArr[i-1]+ arr[i];
        }

        return newArr;
    }
}
