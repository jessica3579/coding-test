import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++){
            String s = sc.next();
            int[] arr = new int[26];
            Boolean isGroupWord = true;
            
            int a = s.charAt(0) - 'a';
            arr[a]++;
            
            for(int j=1; j<s.length(); j++){
                a = s.charAt(j) - 'a';
                arr[a]++;
                if(s.charAt(j) != s.charAt(j-1) && arr[a] > 1) {
                    isGroupWord = false;
                    break;
                }
            }
            
            if(isGroupWord) sum++;
        }
        
        System.out.println(sum);
    }
}