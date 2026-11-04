public class Main {
    public static void main(String[] args) {
        // 造两个账户对象：a 和 b 各是一份独立的数据（多对象互不影响）。
        Account a = new Account();
        Account b = new Account();

        // 分别给 a、b 设余额，验证「两个对象各存各的」。
        a.setBalance(1300);
        b.setBalance(50);
        System.out.println(a.getBalance());   // 1300.0
        System.out.println(b.getBalance());   // 50.0

        // 给 a 设户主名，再存 500，看存钱后余额。
        a.setOwner("张三");
        a.setBalance(1000);
        a.deposit(500);                        // 1000 + 500 = 1500，并打印「张三 存了 500.0」
        System.out.println(a.getOwner());      // 张三
        System.out.println(a.getBalance());    // 1500.0

        // 取钱：取 500 合法；再想取 99999 超过余额，被 withdraw 第二道校验拦下。
        a.withdraw(500);                       // 1500 - 500 = 1000，打印「张三 取了 500.0」
        a.withdraw(99999);                     // 99999 > 1000，return; 提前离场，余额不变
        System.out.println(a.getBalance());    // 1000.0
    }
}
