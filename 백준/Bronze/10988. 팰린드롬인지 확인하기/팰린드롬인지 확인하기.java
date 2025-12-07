import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String r = new StringBuilder(s).reverse().toString();
        
        System.out.println(s.equals(r) ? 1 : 0);
    }
}
