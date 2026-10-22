public class SeatFill{
    public static void main(String[] args) {
        int[][] seats = new int [5][4];              // 5 行 4 列，元素初值 0
        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                seats[i][j] = i * 4 + j + 1;         // 序号 = i*4（前 i 整行已排满）+ j+1（本行）
            }
        }
        for(int i = 0; i < seats.length; i++) {      // 外层行数 seats.length，内层列数 seats[i].length
            for(int j = 0; j < seats[i].length; j++){
                System.out.print(seats[i][j] + " "); // print 不换行，空格分隔
            }
            System.out.println();                    // 一行打完再换行
        }
    }
}
