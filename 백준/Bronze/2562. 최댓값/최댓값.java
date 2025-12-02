import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int max_index = -1;
        
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                max_index = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(max_index);
    }
}