class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int i[] : points) {
           pq.add(new int[]{(i[0]*i[0] + i[1]*i[1]), i[0], i[1]});
            if(pq.size() > k)
                pq.poll();
        }
        int ans[][] = new int[k][2];
        int j = 0;
        for(int i[] : pq) {
            ans[j][0] = i[1];
            ans[j][1] = i[2];
            j ++;
        }
        return ans;
    }
}