package lesson08;

class Score {
    int total = 0;
    int rounds = 0;

    void add(int n) {
        total = total + n;
        rounds = rounds + 1;
    }

    int average() {
        return total / rounds;
    }
}

public class Report {
    static void line(Score s, String name) {
        System.out.println(name + " 平均 " + s.average());
    }

    public static void main(String[] args) {
        Score a = new Score();
        Score b = new Score();

        a.add(80);
        a.add(90);
        b.add(70);
        a.add(100);

        line(a, "甲");
        line(b, "乙");
    }
}
