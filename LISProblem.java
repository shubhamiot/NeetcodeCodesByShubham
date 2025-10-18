import java.util.Arrays;

public class LISProblem {

    public static void main(String[] args) {

        int[] arr = {10,9,2,5,3,7,101,18};
        int lenght = listProblem(arr);
        System.out.println(lenght);
    }

    private static int listProblem(int[] num) {

        int[] dp = new int[num.length];
        for(int i=1; i<num.length; i++){
            for(int j=0; j<i;j++){
                if(num[i]<num[j] && dp[i]>=dp[j]){
                    dp[i]=dp[j]+1;
                }
            }
        }
        Arrays.sort(dp);
        return dp[num.length-1]+1;
    }
}
