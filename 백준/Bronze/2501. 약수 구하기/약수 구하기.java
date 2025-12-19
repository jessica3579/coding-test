import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int index = sc.nextInt();
        int count = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0) count++;
            if(count == index){
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
        
    }
}