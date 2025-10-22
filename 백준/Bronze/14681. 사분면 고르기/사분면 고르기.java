import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        
        if(a > 0 && b > 0) System.out.println(1);
        else if(a < 0 && b > 0 ) System.out.println(2);
        else if(a < 0 && b < 0 ) System.out.println(3);
        else System.out.println(4);
    }
}