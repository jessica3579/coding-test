import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); 

        int[] pos = new int[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (pos[idx] == -1) {  
                pos[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(pos[i]);
            if (i != 25) System.out.print(" ");
        }
    }
}