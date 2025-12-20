import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n != -1){
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=1; i<n; i++){
                if(n % i == 0){
                    sum += i;
                    arr.add(i);
                }
            }
            
            if(sum != n) System.out.println(n + " is NOT perfect.");
            else {
                System.out.print(n + " = ");
                for(int i=0; i<arr.size(); i++){
                    if(i != arr.size()-1) System.out.print(arr.get(i) + " + ");
                    else System.out.println(arr.get(i));
                }
            }
            
            n = sc.nextInt();
        }
    }
}