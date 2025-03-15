package cw;
import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0],y[0]));
        int sum=0;
        if(intervals.length!=0){
            int start=intervals[0][0];
            int end=intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                int currentStart=intervals[i][0];
                int currentEnd=intervals[i][1];
                if (end>currentStart){
                    end=Math.max(currentEnd,end);
                }else {
                    sum+=end-start;
                    start=currentStart;
                    end=currentEnd;
                }
            }
            sum+=end-start;
        }
        return sum;
    }
}
