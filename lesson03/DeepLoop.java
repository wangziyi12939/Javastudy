package lesson03;

public class DeepLoop {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 5) {
            System.out.println("i = " + i + ", j = " + j);
            j++;
        }
        System.out.println("循环结束");
    }
}
