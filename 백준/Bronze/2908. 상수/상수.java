import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        int ra = reverse(a);
        int rb = reverse(b);
        
        System.out.println(Math.max(ra, rb));
    }
    
    public static int reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return Integer.parseInt(sb.reverse().toString());
    }
}