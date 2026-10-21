package lesson04;

public class ArrayMaxMin{
    public static void main(String[] args) {
        int[] scores = {72, 90, 65, 88, 95};
        int max = scores[0];
        int min = scores[0];
        for(int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}