public class SortedArray {


    public static void main(String[] args) {
        int[] arr = {2,3,5,5,9,10,17,18};
        int n = 8;
        boolean b = sortedArray(arr, n);
        System.out.println(b);

    }

    private static boolean sortedArray(int[] arr, int n) {

        for(int i=0; i< n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }

        return true;
    }
}
