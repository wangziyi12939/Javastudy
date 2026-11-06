package lesson07;

// 对照实验：求 1 + 2 + ... + n
// 甲 = 只用递归（正确）  乙 = 递归里再套 for（错误写法，不报错，答案错）
public class SumCompare {

    // 甲：只有「我这层 + 下面所有的」
    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    // 乙：每一层都自己把 1..n 再加一遍
    static int sumBoth(int n) {
        if (n == 1) {
            return 1;
        }
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t = t + i;
        }
        return t + sumBoth(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("甲 sumRec(5)  = " + sumRec(5));
        System.out.println("乙 sumBoth(5) = " + sumBoth(5));
    }
}
