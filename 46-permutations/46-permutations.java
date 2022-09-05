class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        int len=nums.length;
        List<List<Integer>> Rootlist= new ArrayList<>();
        topdown(0,len,nums,Rootlist);
        return Rootlist;
    }
    
    public void topdown(int start,int len, int[] nums, List<List<Integer>> Rootlist)
    {
        if(start==len-1)
        {
            ArrayList<Integer> sublist=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                int curr=nums[i];
                sublist.add(curr);
            }
            Rootlist.add(sublist);
            return;
        }
        int top=start;
        for(int i=top;i<len;i++)
        {
            swap(nums,i,start);
            topdown(start+1,len,nums,Rootlist);
            swap(nums,i,start);
        }
    }
    
    public void swap(int[] nums,int first,int last)
    {
            int temp=0;
            temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
    }
}