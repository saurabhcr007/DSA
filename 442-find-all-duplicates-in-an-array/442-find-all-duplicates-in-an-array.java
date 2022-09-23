class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                list.add(nums[i]);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return list;
    }
}