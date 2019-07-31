/**

给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
进阶:

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-subarray
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

**/

class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        
        //以0为界限，大于0就是增益效果，小于0则为减益效果，当某个sum，已经小于0了，无论怎样，和下一个加起来，已经拖了下一个了，对下一个进行减益，因为，无论如何，下一个的值绝对大于减益后的值，
        //因此，必须要抛弃上一个，从下一个开始计算。当某个sum，大于0，那么就必须和他加起来，这样子必定大于下一个，收益
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}

/**
几秒前 通过  3 ms    38.4 MB Java
/**