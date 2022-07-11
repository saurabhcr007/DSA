class Solution {
public int[][] merge(int[][] intervals) {
if (intervals == null || intervals.length == 0)
return new int[][]{};
if (intervals.length == 1)
return intervals;
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
int[][] result = new int[intervals.length][2];
int index = 0;
for (int i=1; i<intervals.length; i++)
{
if (intervals[index][1] >= intervals[i][0])
{
intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
}
else {
index++;
intervals[index] = intervals[i];
}
}

    int[][] res = new int[index+1][2];
    for(int i=0;i<=index;i++){
        res[i][0] = intervals[i][0];
        res[i][1] = intervals[i][1];
    }
    return res;
}
}