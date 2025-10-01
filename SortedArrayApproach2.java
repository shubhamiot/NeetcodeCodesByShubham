public class SortedArrayApproach2 {


    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int n = 6;
        boolean checksorted = checksorted(arr, n);
        System.out.println(checksorted);
    }

    private static boolean checksorted(int[] arr, int n) {

        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }
}
