package leetcode.editor.cn;

import leetcode.editor.cn.common.AssertTool;

/**
 * English description is not available for the problem. Please switch to Chinese.
 * Related Topics éå½ æ°å­¦ ð 270 ð 0
 */
public class ShuZhiDeZhengShuCiFangLcof {

    static
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        /**
         * å®ç° pow(x, n) ï¼å³è®¡ç® x ç n æ¬¡å¹å½æ°ï¼å³ï¼xnï¼ãä¸å¾ä½¿ç¨åºå½æ°ï¼åæ¶ä¸éè¦èèå¤§æ°é®é¢ã
         * å¿«éå¹O(logN)   2^7=2^3 * 2^3 *2
         * https://oi-wiki.org/math/quick-pow/
         *
         * @param x
         * @param n
         * @return
         */
        public double myPow(double x, int n) {
            long b = n; // é¿å-(-2147483648)=-2147483648çé®é¢ï¼intçæ­£è´èå´ä¸å
            if (n == 0) return 1;
            if (x == 0) return 0;
            if (b < 0) {
                x = 1 / x;
                b = -b;
            }
            double res = myPow(x, (int) (b / 2));
            if ((b % 2) == 1) return res * res * x;
            return res * res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        final double v = new Solution().myPow(2, -2147483648);
        System.out.println(v);
        //fixme WHY? æå¤§çæ­£æ°æ¯2147483647
        AssertTool.assertEquals(-(-2147483648), -2147483648);
    }

}