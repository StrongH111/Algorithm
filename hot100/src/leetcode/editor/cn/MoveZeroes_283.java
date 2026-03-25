package leetcode.editor.cn;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
//
// Related Topics 数组 双指针 👍 2865 👎 0

//Java：移动零
class MoveZeroes{
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums){
    //  双指针解法：我没思路，问的Gemini
    //  1.定义两个指针，一个快指针，一个慢指针，快指针用来寻找目标元素0，慢指针用来记录非零元素的位置
        int slow = 0;//慢指针，用来记录非零元素的位置
        int count =nums.length;//统计0开始的位置
        //快指针，用来寻找目标元素0
        for ( int fast = 0;  fast < nums.length; fast++) {
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }else{
                count--;
            }
        }
        //给末尾赋值0
        for (int i = count; i <nums.length ; i++) {
            nums[i] = 0;
        }
    }
    public void moveZeroes2(int[] nums){
//  暴力解法2：
//  跟方法1差不多，也是利用两层for循环，内层for循环从0元素开始，与后面元素交换位置
        int count = nums.length;
        for (int i = 0; i < count; i++) {
            if(nums[i] == 0 ){
                for (int j = i; j < nums.length-1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                i--;
                count--;
            }

        }

        }
    public void moveZeroes1(int[] nums) {
//  暴力解法1
//  利用两个for循环，第一个for循环遍历数组返回元素为0的下标，第二个for循环从返回的下标开始，向前移动一位。
//  坑1：遇到0移动数组后，要i--
//  坑2：移动元素后，不要忘了给后面补0
//  坑3：外层for循环i不能遍历到末尾赋值的0，
        int position = nums.length;//用来给末尾赋0
        for (int i = 0; i < position; i++) {
            if(nums[i] == 0){
                for (int j = i; j <nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[nums.length -1] = 0;
                i--;
                position--;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}