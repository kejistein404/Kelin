package com.codepractice.kelin.algorithm;

public class NQueen {

    public static int NQueenNum(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] record = new int[n]; //记录已经确定的皇后在那哪一列
        return process(0, record, n);
    }

    //潜台词record[0...i-1]的所有皇后不共行，不共列
    //目前来到了第i行
    //n代表整体一共有多少行
    //返回值是摆完所有的皇后，合理的摆法有多少种
    private static int process(int i, int[] record, int n) {
        if (i == n) {//到达了中止行
            return 1;
        }
        int res = 0;
        for (int j = 0; j < n; j++) {//当前行在i行，尝试i行的每一列
            if (isValid(record, i, j)) {
                record[i] = j;
                res += process(i + 1, record, n);
            }
        }
        return res;
    }

    private static boolean isValid(int[] record, int i, int j) {
        for (int k = 0; k < i; k++) {
            if (j == record[k] || Math.abs(k - i) == Math.abs(record[k] - j)) {
                return false;
            }

        }
        return true;
    }
}
