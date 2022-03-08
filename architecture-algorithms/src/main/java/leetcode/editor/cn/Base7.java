package leetcode.editor.cn;

import leetcode.editor.cn.common.AssertTool;

/**
 * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: num = 100
 * 输出: "202"
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: num = -7
 * 输出: "-10"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * -10⁷ <= num <= 10⁷
 * <p>
 * Related Topics 数学 👍 168 👎 0
 */
public class Base7 {

    static
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 进制转换
        // https://www.cnblogs.com/gaizai/p/4233780.html
        // Integer.toString(num, 7); // 写法
        public String convertToBase7(int num) {
            if (num == 0) return "0";
            StringBuilder sb = new StringBuilder();
            if (num < 0) sb.append("-");
            recur(num, sb);
            return sb.toString();
        }

        public void recur(int num, StringBuilder sb) {
            if (num != 0) {
                recur(num / 7, sb); // 商数进入递归
                sb.append(Math.abs(num % 7));  // 从下往上读余数
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        AssertTool.assertEquals("-11", new Solution().convertToBase7(-8));
    }
}