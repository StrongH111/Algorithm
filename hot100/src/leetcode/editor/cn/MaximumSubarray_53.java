package leetcode.editor.cn;
//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 子数组 是数组中的一个连续部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [5,4,-1,7,8]
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
//
// Related Topics 数组 分治 动态规划 👍 7344 👎 0

//Java：最大子数组和
 class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            //最大和
            int maxnum = nums[0];
            //遍历过程中求得的和
            int currentnum = nums[0];
            for (int i = 1; i < nums.length; i++) {
//            因为题目要求的是连续子数组，所以再遍历每个元素的时候，只有两种情况
//            要么从当前元素开始，要么加上当前元素继续遍历
//            因此要比较加上元素之后的值和当前元素的值谁更大
                currentnum = ((currentnum + nums[i]) > nums[i]) ? (currentnum + nums[i]) : nums[i];
                maxnum = (maxnum > currentnum) ? maxnum : currentnum;
                //这里的比较没有用if-else语句，感觉用三元运算符写很装

            }
//        最后返回最大和
            return maxnum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
//暴力没解出来，问的Gemini思路，说是动态规划+贪心（Kadane 算法）
// 如果要打印出最大子数组该咋写呢？
// 我的思路：
//         每给maxnum赋值的时候，记录一下i的值，maxnum是最大和，i就是最大和的结束位置
//         然后再从i开始遍历 i--，sum += nums[i] 直至等于 maxnum 边遍历边打印nums[i]的值
//  坑：
//        含有 0 的“边界干扰的用例：nums = [0, 4, -1, 2, 1, 0]；
//        正负抵消导致的“虚假起点 ：nums = [1, -1, 4, -1, 2, 1]
// Gemini:
//      增加两个变量strat和end分别记录子数组的起始位置和终止位置，start的起始位置是0，
//      当(currentnum + nums[i]) < nums[i]时，子数组从当前开始，strat赋值为 i
//       当 maxnum < currentnum 时，此时的i就是终止位置，end赋值为 i
}