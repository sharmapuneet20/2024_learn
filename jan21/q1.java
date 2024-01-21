//  single element in an arry

public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(nums.length ==1){
            return nums[0];
        }
        //  0th index
        if(nums[0] != nums[1]){
            return nums[0];
        }
        // 1st index
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        int lo = 2;
        int hi = n-3;
//  binary search
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid +1]){
                return nums[mid];
            }

            // if sec occurence
             if(nums[mid] == nums[mid-1]){
                     mid--;
             }

             if(mid%2==0){
                 lo = mid +2 ;
             }else{
                 hi = mid -1;
             }

        }
        return -1;
    }
