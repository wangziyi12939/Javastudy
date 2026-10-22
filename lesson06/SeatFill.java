public class SeatFill{
    public static void main(String[] args) {
        int[][] seats = new int [5][4];
        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                seats[i][j] = i * 4 + j + 1;
            }
        }
        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}