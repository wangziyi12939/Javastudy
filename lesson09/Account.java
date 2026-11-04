public class Account {
    // 字段：owner 是户主名，balance 是余额。
    // 前面加 private —— 封装第一条好处「藏」：外面不能直接 a.balance = 9999，只能走下面的方法。
    private String owner;
    private double balance;

    // ---- 看余额：getter ----
    public double getBalance() {
        return balance;
    }

    // ---- 改余额：setter ----
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // ---- 存钱：deposit ----
    public void deposit(double amount) {
        if (amount <= 0) {              // 校验：金额不合法（0 或负数）就拦
            return;                     // return; 不带值 = void 方法里「提前离场」
        }
        balance += amount;              // 合法才加钱
        System.out.println(owner + " 存了 " + amount);   // 出声，方便看结果
    }

    // ---- 取钱：withdraw ----
    public void withdraw(double amount) {
        if (amount <= 0) {              // 校验①：同 deposit，不取 0 或负数
            return;
        }
        if (amount > balance) {         // 校验②：取的比余额多 = 余额不足，拦
            return;
        }
        balance -= amount;              // 两道校验都过了，才扣钱
        System.out.println(owner + " 取了 " + amount);
    }

    // ---- 户主名：getter / setter ----
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
