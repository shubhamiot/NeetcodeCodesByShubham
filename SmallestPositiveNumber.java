import java.util.Arrays;

public class SmallestPositiveNumber {

    public static void main(String[] args){
        int [] arr = {1,3,6,4,1,2};
        int size = 5;
        int i = smallestPostive(arr, size);
        System.out.println(i);
    }

    private static int smallestPostive(int[] num, int size){
        Arrays.sort(num);
        int n =1;
        for(int i=0; i<size; i++){
            if(num[i]==n && num[i]>=0){
                n++;
            }
        }
        return n;
    }
}
