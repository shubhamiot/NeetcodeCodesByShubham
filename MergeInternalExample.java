import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInternalExample {

    public static void main(String[] args) {
        int[][] interval = {{1,3},{2,6},{8,10},{15,8}};
        int[][] ints = mergeInterval(interval);
        for(int[] i : ints){
            System.out.println(Arrays.toString(i));
        }
    }

    private static int[][] mergeInterval(int[][] intervals) {

        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for(int[] interval : intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1]= Math.max(newInterval[1], interval[0]);
            }else{
                newInterval= interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
