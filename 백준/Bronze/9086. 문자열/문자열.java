import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<t; i++){
            String s = sc.nextLine();
            char first = s.charAt(0);
            char last = s.charAt(s.length() -1);
            System.out.println("" + first + last);
        }
    }
}