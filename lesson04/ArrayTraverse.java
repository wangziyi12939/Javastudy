package lesson04;

public class ArrayTraverse {
    public static void main(String[] args) {
        int[] scores = {72, 90, 65, 88, 95};
        for(int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i+1) + "个" + scores[i]);
        }
    }
}
