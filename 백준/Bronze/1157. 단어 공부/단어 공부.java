import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        int[] arr = new int[26];
        
        word = word.toUpperCase();
        int maxValue = 0;
        int maxIndex = -1;
        
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'A';
            arr[index]++;
            if(arr[index] > maxValue) {
                maxValue = arr[index];
                maxIndex = index;
            }
        }
        
        boolean isBreak = false;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == maxValue) {
                if(isBreak) {
                    System.out.println("?");
                    return;
                }
                isBreak = true;
            }
        }
        
        System.out.println((char)(maxIndex + 'A'));
    }
}