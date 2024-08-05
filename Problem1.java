//TC: O(n)
//SC: O(n)
//Approach: save previous values and index in a hash map to get in O(1). For every element try to find target - element in map.

//leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();

        for(int i =0; i<nums.length;i++){
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}