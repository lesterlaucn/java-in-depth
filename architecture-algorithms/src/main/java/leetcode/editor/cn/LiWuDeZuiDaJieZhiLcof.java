package leetcode.editor.cn;

import org.junit.jupiter.api.Assertions;

/**
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到
 * 达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 < grid.length <= 200
 * 0 < grid[0].length <= 200
 * <p>
 * Related Topics 数组 动态规划 矩阵 👍 253 👎 0
 */
public class LiWuDeZuiDaJieZhiLcof {

    static
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        // 算出所有格子的最大礼物价值
        // 原grid作为dp数组
        public int maxValue(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) continue;
                    if (i == 0) grid[i][j] += grid[i][j - 1];
                    else if (j == 0) grid[i][j] += grid[i - 1][j];
                    else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }
            }
            return grid[m - 1][n - 1];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        Assertions.assertEquals(12, new Solution().maxValue(grid));
    }
}