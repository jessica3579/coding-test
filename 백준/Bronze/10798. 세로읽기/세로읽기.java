import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] arr = new String[5];
        
        for(int i=0; i<5; i++){
            arr[i] = sc.next();
        }
        
        for(int col=0; col<15; col++){
            for(int row=0; row<5; row++){
                if(col < arr[row].length()) System.out.print(arr[row].charAt(col));
            }
        }
        
    }
}