import java.util.HashMap;

public class TwoSumUsingHasing {

    public static void main(String[] args) {
     int[] arr = {2,6,5,8,11};
     int target = 14;
        int[] ints = twoSumProblem(arr, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    private static int[] twoSumProblem(int[] arr, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int diff = target - num;

            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff), i};
            }

            hashMap.put(num, i);
        }

        return new int[]{};
    }
}
