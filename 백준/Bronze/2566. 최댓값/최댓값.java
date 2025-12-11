import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[10][10];
        
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = -1;
        int max_x = -1;
        int max_y = -1;
        
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    max_x = i;
                    max_y = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(max_x + " " + max_y);
    }
}