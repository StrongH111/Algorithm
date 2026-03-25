package leetcode.editor.cn;
//给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。 
//
// 子数组是数组中元素的连续非空序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,1], k = 2
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3], k = 3
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -1000 <= nums[i] <= 1000 
// -10⁷ <= k <= 10⁷ 
// 
//
// Related Topics 数组 哈希表 前缀和 👍 3093 👎 0

//Java：和为 K 的子数组
class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
        System.out.println(solution.subarraySum(new int[]{1, 1, 1}, 2));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            return 0;
        }
    }
}


//leetcode submit region end(Prohibit modification and deletion)
/* 不能用双指针+动态窗口解，因为数组中的元素有正有负，不能保证窗口内的和是递增的。
            int num = 0;//记录子数组的个数
//      一个指针定在起始位置，另一个指针去移动，用sum记录移动和与k作比较，
//      如果sum小于k，则右指针继续移动，如果sum大于k，则左指针移动，如果sum等于k，则num+1
            for (int left = 0; left < nums.length; left++) {
                int sum = 0;
                int right = left;
                while (right < nums.length && (sum + nums[right]) <= k ) {
                    if ((sum + nums[right]) < k) {
                        right++;
                    } else {
                        num++;
                    }
                }
            }
            return num;*/
