package com.imola.leetcode.backtracking;

/**
 * @author Heng Yu
 * @date 2/7/20 9:35 PM
 */

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 89: Gray Code
 *
 * description:
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 *
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code.
 * A gray code sequence must begin with 0.
 *
 * example 1:
 * Input: 2     size = 4 100
 * Output: [0,1,3,2]
 * Explanation:
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 *
 * For a given n, a gray code sequence may not be uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence.
 *
 * 00 - 0
 * 10 - 2
 * 11 - 3
 * 01 - 1
 *
 * example 2:
 * Input: 0
 * Output: [0]
 * Explanation: We define the gray code sequence to begin with 0.
 *              A gray code sequence of n has size = 2n, which for n = 0 the size is 20 = 1.
 *              Therefore, for n = 0 the gray code sequence is [0].
 */

/**
 * 思路: https://segmentfault.com/a/1190000003741403
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 0; i < n; ++i) {
            int leftDigit = 1 << i;
            for (int j = res.size() - 1; j >= 0; --j) {
                res.add(res.get(j) + leftDigit);
            }
        }
        return res;
    }
}
