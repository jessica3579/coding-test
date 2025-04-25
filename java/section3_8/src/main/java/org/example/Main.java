package org.example;


// 내가 푼 방식 -- 구글링 많이 함..
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class Main {
//    public int[] solution(int n, int[] arr){
//        int[] answer = new int[n];
//        ArrayList<Integer> score = new ArrayList<>();
//        for(int i=0; i<n; i++){
//            score.add(arr[i]);
//        }
//        Collections.sort(score, Collections.reverseOrder());
//        for(int i=0; i<n; i++){
//            answer[i] = score.indexOf(arr[i]) +1;
//        }
//         return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//        for(int x : T.solution(n, arr)) System.out.print(x + " ");
//    }
//}


// 강사님 풀이
import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[i] < arr[j]) cnt++;
            }
            answer[i] = cnt;
        }
         return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}