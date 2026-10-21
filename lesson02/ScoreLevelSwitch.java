package lesson02;

public class ScoreLevelSwitch {
    public static void main(String[] args){
        int day = 1;
        switch (day) {
            case 1: System.out.println("周一"); break;
            case 2: System.out.println("周二"); break;
            case 3: System.out.println("周三"); break;
            default: System.out.println("其他"); break;
        }
    }
}