import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] basket = new int[n+1];
        
        for(int i=1; i<=n; i++){
            basket[i] = i;
        }
        
        for(int a=0; a<m; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int mid = (i+j)/2;
            for(int b=i; b<=mid; b++){
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }
        
        for(int i=1; i<=n; i++)
        {
            System.out.print(basket[i] + " ");
        }    
    }
}