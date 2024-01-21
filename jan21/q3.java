class Solution {
    public int findPeakElement(int[] nums) {
         if(nums.length == 1){
             return 0;
         }
        
         if(nums[0]> nums[1]){
             return 0;
         }
          if( nums[nums.length -1] > nums[nums.length -2]){
             return nums.length-1;
         }

         int n = nums.length;


         int start = 1;
         int end = n -2;

         while(start <= end){
                // int peak = Math.Integer.MIN_VALUE;
                int mid = (start + end )/2;
                if(nums[mid] >= nums[mid-1] &&  nums[mid] >= nums[mid +1]){
                    return  mid;
                }
               else if(nums[mid] < nums[mid -1]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
                


                

         }
        return -1;
    }
}
