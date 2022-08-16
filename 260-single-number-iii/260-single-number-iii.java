class Solution {
    public int[] singleNumber(int[] nums) {
        int length=nums.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<length;i++){
            if(map.get(nums[i])==1){
                list.add(nums[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}