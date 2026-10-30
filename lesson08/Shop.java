class Cart {
    int sum = 0;
    int count = 0;

    void put(int price) {
        sum = sum + price;
        count = count + 1;
    }

    int avg() {
        return sum / count;
    }
}

public class Shop {
    static void print(Cart c, String who) {
        System.out.println(who + "：" + c.avg());
    }

    static int discount(int price) {
        return price * 8 / 10;
    }

    public static void main(String[] args) {
        Cart x = new Cart();
        Cart y = new Cart();

        x.put(30);
        x.put(51);
        y.put(20);

        print(x, "甲");
        print(y, "乙");
    }
}
