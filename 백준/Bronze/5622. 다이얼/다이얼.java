import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int sum = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 67) sum += 3;
            else if(c >= 68 && c <= 70) sum += 4;
            else if(c >= 71 && c <= 73) sum += 5;
            else if(c >= 74 && c <= 76) sum += 6;
            else if(c >= 77 && c <= 79) sum += 7;
            else if(c >= 80 && c <= 83) sum += 8;
            else if(c >= 84 && c <= 86) sum += 9;
            else if(c >= 87 && c <= 90) sum += 10;
        }
        
        System.out.print(sum);
    }
}