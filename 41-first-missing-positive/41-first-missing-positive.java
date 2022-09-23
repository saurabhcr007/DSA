class Solution {
    public int firstMissingPositive(int[] nums) {
        int temp=0;
         int len=nums.length;
        for(int i=0;i<len;i++) {
		    for(int j=0;nums[i]>0 && nums[i]<=len;j++) {
			    temp=nums[nums[i]-1];
			    if(temp==nums[i]){
                    break;
                }
				nums[nums[i]-1]=nums[i];
			    nums[i]=temp;
                System.out.print(j);
		    }
	    }
	    for(int i=0;i<len;i++) {
            if(nums[i]!=i+1)
			    return i+1;
        }	
	    return len+1;
    }
}