public class Main {
    public static void main(String[] args) {
        System.out.println("=== 计算机测试 ===");
        System.out.println("3 + 5 =" + Calculator.add(3, 5));   
        System.out.println("10 - 3 =" + Calculator.subtract(10, 3));    
        System.out.println("4 * 5 =" + Calculator.multiply(4, 5));       
        System.out.println("10 / 3 =" + Calculator.divide(10, 3));       
        System.out.println("1.5 + 2.5 =" + Calculator.add(1.5, 2.5));     
        System.out.println("1 + 2 + 3 =" + Calculator.add(1, 2, 3));
        System.out.println("max(3,7,5) =" + Calculator.max(3, 7, 5));
    }
}