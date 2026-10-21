package lesson03;

public class CountTo7{
    public static void main(String[] args){
        int i = 1;
        for(i = 1; i<=20; i++){ 
            if (i==7) break; 
            System.out.println(i); 
        }
    }
}