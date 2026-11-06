package lesson08;

class Counter {
    int count = 0;

    void add(int n) {
        count = count + n;
    }

    int get() {
        return count;
    }
}

public class CounterDemo {
    static void show(Counter c, String label) {
        System.out.println(label + "：" + c.get());
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        a.add(3);
        b.add(7);
        a.add(5);

        show(a, "a 的值");
        show(b, "b 的值");
    }
}
