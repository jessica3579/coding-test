import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int i = 0;
        int j = s.length()-1;
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println(0);
                return;
            }
            i++;
            j--;
        }
        
        System.out.println(1);
        sc.close();
    }
}