import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int move = 0;
        int stnd = 1;
        while(true){
            if(n <= stnd) break;
            
            move++;            
            stnd += 6 * move;
        }
        System.out.print(move + 1);
    }
}