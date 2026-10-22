public class ScoreStats{
    public static void main(String[] args) {
        int[] scores = {78, 45, 92, 60, 33};
        int sum = 0;
        double avg = 0;
        int max = scores[0];
        int min = scores[0];
        int fail = 0;
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            if(scores[i] > max) {
                max = scores[i];
            }
            if(scores[i] < min) {
                min = scores[i];
            }
            if(scores[i] < 60) {
                fail += 1;
            }
        }
        avg = (double) sum / (double) scores.length;
        System.out.println("总分：" + sum);
        System.out.println("平均：" + avg);
        System.out.println("最高：" + max);
        System.out.println("最低：" + min);
        System.out.println("不及格：" + fail);
    }
}